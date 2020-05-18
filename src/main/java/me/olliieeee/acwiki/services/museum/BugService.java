package me.olliieeee.acwiki.services.museum;

import me.olliieeee.acwiki.types.museum.Bug;

import java.util.Set;

public interface BugService extends MuseumService<Bug> {
    Set<Bug> getByBasic(String name, String location, Integer price, Integer month);
}
