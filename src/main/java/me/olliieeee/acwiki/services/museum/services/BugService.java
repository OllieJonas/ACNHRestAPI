package me.olliieeee.acwiki.services.museum.services;

import me.olliieeee.acwiki.services.museum.CreatureService;
import me.olliieeee.acwiki.types.museum.Bug;

import java.util.Set;

public interface BugService extends CreatureService<Bug> {
    Set<Bug> getByBasic(String name, String location, Integer price, Integer month);
}
