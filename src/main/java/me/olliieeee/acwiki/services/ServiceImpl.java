package me.olliieeee.acwiki.services;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import me.olliieeee.acwiki.types.ACItem;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.Objects;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public abstract class ServiceImpl<T extends ACItem> implements Service<T> {

    protected final Supplier<TypeToken<Set<T>>> supplier;

    protected final String file;

    protected Set<T> items;

    public ServiceImpl(Supplier<TypeToken<Set<T>>> delegate, String file) {
        this.supplier = delegate;
        this.file = file;
    }

    public void init() {
        Type type = supplier.get().getType();
        URL fileUrl = Service.class.getClassLoader().getResource(file);
        try {
            JsonReader reader = new JsonReader(new FileReader(Objects.requireNonNull(fileUrl).getPath()));
            items = new Gson().fromJson(reader, type);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Set<T> getAll() {
        return items;
    }

    public Set<T> getByName(String name) {
        return items.parallelStream()
                .filter(e -> e.getName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toSet());
    }
}
