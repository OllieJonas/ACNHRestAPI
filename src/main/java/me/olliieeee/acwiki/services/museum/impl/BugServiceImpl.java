package me.olliieeee.acwiki.services.museum.impl;

import com.google.gson.reflect.TypeToken;
import me.olliieeee.acwiki.services.museum.services.BugService;
import me.olliieeee.acwiki.types.museum.Bug;

import java.util.Set;

public class BugServiceImpl extends MuseumServiceImpl<Bug> implements BugService {

    public BugServiceImpl() {
        super(() -> new TypeToken<>() {}, "data/museum/bugs.json");
    }

    @Override
    public Set<Bug> getByBasic(String name, String location, Integer price, Integer month) {
        return null;
    }
}
