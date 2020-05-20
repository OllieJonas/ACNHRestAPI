package me.olliieeee.acwiki.services;

import com.google.gson.reflect.TypeToken;
import me.olliieeee.acwiki.types.Villager;

public class VillagerServiceImpl extends ServiceImpl<Villager> implements VillagerService {

    public VillagerServiceImpl() {
        super(() -> new TypeToken<>(){}, "data/villagers.json");
    }

}
