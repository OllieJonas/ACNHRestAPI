package me.olliieeee.acwiki.services;

import me.olliieeee.acwiki.types.museum.Fish;

import java.util.Set;

public interface FishService extends Service {
    Set<Fish> getFishByName(String name);
    Set<Fish> getFishByLocation(String location);
    Set<Fish> getAll();
}
