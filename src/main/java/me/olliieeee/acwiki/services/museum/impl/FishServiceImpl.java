package me.olliieeee.acwiki.services.museum.impl;

import com.google.gson.reflect.TypeToken;
import me.olliieeee.acwiki.services.museum.services.FishService;
import me.olliieeee.acwiki.types.museum.Fish;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class FishServiceImpl extends MuseumServiceImpl<Fish> implements FishService {

    public FishServiceImpl() {
        super(() -> new TypeToken<>(){}, "data/museum/fish.json");
    }

    public Set<Fish> getFishByLocation(String location) {
        return items.parallelStream()
                .filter(item -> item.getLocation().equalsIgnoreCase(location))
                .collect(Collectors.toSet());
    }

    @Override
    public Set<Fish> getOutputByBasic(String name, String location, Integer price, Integer shadowSize, Integer month) {
        Set<Predicate<Fish>> predicates = new HashSet<>();

        predicates.add(name != null ? e -> e.getName().toLowerCase().contains(name.toLowerCase()) : TRUE);
        predicates.add(location != null ? e -> e.getLocation().equalsIgnoreCase(location) : TRUE);
        predicates.add(price != null ? e -> e.getPrice().equals(price) : TRUE);
        predicates.add(shadowSize != null ? e -> e.getShadowSize().equals(shadowSize) : TRUE);
        predicates.add(month != null ? e -> e.getNorthernMonths().contains(month) : TRUE);
        
        return items.parallelStream().filter(predicates.stream().reduce(Predicate::and).orElse(t -> true)).collect(Collectors.toSet());
    }
}
