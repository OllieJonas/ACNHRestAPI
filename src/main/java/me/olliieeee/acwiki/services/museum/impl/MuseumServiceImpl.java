package me.olliieeee.acwiki.services.museum.impl;

import com.google.gson.reflect.TypeToken;
import lombok.Getter;
import me.olliieeee.acwiki.services.ServiceImpl;
import me.olliieeee.acwiki.services.museum.MuseumService;
import me.olliieeee.acwiki.types.museum.MuseumItem;

import java.util.Set;
import java.util.function.Predicate;
import java.util.function.Supplier;

public abstract class MuseumServiceImpl<T extends MuseumItem> extends ServiceImpl<T> implements MuseumService<T> {
    public MuseumServiceImpl(Supplier<TypeToken<Set<T>>> delegate, String file) {
        super(delegate, file);
    }
}
