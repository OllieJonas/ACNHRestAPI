package me.olliieeee.acwiki.services.museum.impl;

import com.google.gson.reflect.TypeToken;
import me.olliieeee.acwiki.services.museum.services.MultipartService;
import me.olliieeee.acwiki.types.museum.Multipart;

public class MultipartServiceImpl extends MuseumServiceImpl<Multipart> implements MultipartService {
    public MultipartServiceImpl() {
        super(() -> new TypeToken<>(){}, "data/museum/multipart.json");
    }
}
