package me.olliieeee.acwiki.services.museum.impl;

import com.google.gson.reflect.TypeToken;
import me.olliieeee.acwiki.services.museum.services.SculptureService;
import me.olliieeee.acwiki.types.museum.Art;

public class SculptureServiceImpl extends MuseumServiceImpl<Art> implements SculptureService {

    public SculptureServiceImpl() {
        super(() -> new TypeToken<>(){}, "data/museum/sculptures.json");
    }

}
