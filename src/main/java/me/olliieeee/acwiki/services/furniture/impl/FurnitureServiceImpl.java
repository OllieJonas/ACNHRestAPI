package me.olliieeee.acwiki.services.furniture.impl;

import com.google.gson.reflect.TypeToken;
import me.olliieeee.acwiki.services.ServiceImpl;
import me.olliieeee.acwiki.services.furniture.FurnitureService;
import me.olliieeee.acwiki.types.furniture.Furniture;

import java.util.Set;
import java.util.function.Supplier;

public class FurnitureServiceImpl<T extends Furniture> extends ServiceImpl<T> implements FurnitureService<T> {

    public FurnitureServiceImpl(Supplier<TypeToken<Set<T>>> delegate, String file) {
        super(delegate, file);
    }

}
