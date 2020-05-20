package me.olliieeee.acwiki.services.museum.impl;

import com.google.gson.reflect.TypeToken;
import me.olliieeee.acwiki.services.museum.StandaloneService;
import me.olliieeee.acwiki.types.museum.Standalone;

import java.util.Set;
import java.util.function.Supplier;

public class StandaloneServiceImpl extends MuseumServiceImpl<Standalone> implements StandaloneService {

    public StandaloneServiceImpl() {
        super(() -> new TypeToken<>(){}, "data/museum/standalone.json");
    }
}
