package me.olliieeee.acwiki.services.museum.impl;

import com.google.gson.reflect.TypeToken;
import me.olliieeee.acwiki.services.museum.PaintingService;
import me.olliieeee.acwiki.types.museum.Art;

public class PaintingServiceImpl extends MuseumServiceImpl<Art> implements PaintingService {

    public PaintingServiceImpl() {
        super(() -> new TypeToken<>(){}, "data/museum/paintings.json");
    }

}
