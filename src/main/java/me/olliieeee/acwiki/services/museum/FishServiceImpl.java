package me.olliieeee.acwiki.services.museum;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import lombok.Getter;
import me.olliieeee.acwiki.controllers.FishController;
import me.olliieeee.acwiki.types.museum.Fish;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class FishServiceImpl extends MuseumServiceImpl<Fish> implements FishService {

    @Getter
    private Set<Fish> fish;

    @Override
    public void init() {
        Type type = new TypeToken<HashSet<Fish>>(){}.getType();
        URL fileUrl = FishController.class.getClassLoader().getResource("data/museum/fish.json");
        try {
            JsonReader reader = new JsonReader(new FileReader(Objects.requireNonNull(fileUrl).getPath()));
            fish = new Gson().fromJson(reader, type);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Set<Fish> getByName(String name) {
        return fish.parallelStream()
                .filter(item -> item.getName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toSet());
    }

    public Set<Fish> getFishByLocation(String location) {
        return fish.parallelStream()
                .filter(item -> item.getLocation().equalsIgnoreCase(location))
                .collect(Collectors.toSet());
    }

    @Override
    public Set<Fish> getAll() {
        return fish;
    }

    @Override
    public Set<Fish> getOutputByBasic(String name, String location, Integer price, Integer shadowSize, Integer month) {

        Predicate<Fish> TRUE = ignored -> true;
        Set<Predicate<Fish>> predicates = new HashSet<>();

        predicates.add(name != null ? e -> e.getName().toLowerCase().contains(name.toLowerCase()) : TRUE);
        predicates.add(location != null ? e -> e.getLocation().equalsIgnoreCase(location) : TRUE);
        predicates.add(price != null ? e -> e.getPrice() == price : TRUE);
        predicates.add(shadowSize != null ? e -> e.getShadowSize() == shadowSize : TRUE);
        predicates.add(month != null ? e -> e.getNorthernMonths().contains(month) : TRUE);
        
        return fish.parallelStream().filter(predicates.stream().reduce(Predicate::and).orElse(t -> true)).collect(Collectors.toSet());
    }
}
