package me.olliieeee.acwiki.services.museum;

import me.olliieeee.acwiki.services.Service;
import me.olliieeee.acwiki.types.museum.Fish;

import java.util.Set;

public interface FishService extends Service<Fish> {
    Set<Fish> getOutputByBasic(String name, String location, Integer price, Integer shadowSize, Integer month);
}
