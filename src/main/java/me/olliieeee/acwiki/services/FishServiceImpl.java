package me.olliieeee.acwiki.services;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import lombok.Getter;
import me.olliieeee.acwiki.controllers.FishController;
import me.olliieeee.acwiki.types.museum.Fish;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class FishServiceImpl implements FishService {

    @Getter
    private Set<Fish> fish;

    @Override
    public void init() {
        Type type = new TypeToken<HashSet<Fish>>(){}.getType();
        URL fileUrl = FishController.class.getClassLoader().getResource("data/museum/fish.json");
        try {
            JsonReader reader = new JsonReader(new FileReader(Objects.requireNonNull(fileUrl).getPath()));
            Gson gson = new Gson();
            fish = gson.fromJson(reader, type);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Set<Fish> getFishByName(String name) {
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
}
