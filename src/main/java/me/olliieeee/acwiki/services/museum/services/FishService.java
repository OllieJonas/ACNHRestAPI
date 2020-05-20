package me.olliieeee.acwiki.services.museum.services;

import me.olliieeee.acwiki.services.Service;
import me.olliieeee.acwiki.services.museum.CreatureService;
import me.olliieeee.acwiki.types.museum.Fish;

import java.util.Set;

public interface FishService extends CreatureService<Fish> {
    Set<Fish> getOutputByBasic(String name, String location, Integer price, Integer shadowSize, Integer month);
}
