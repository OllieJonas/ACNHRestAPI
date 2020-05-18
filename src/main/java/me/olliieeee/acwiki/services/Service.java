package me.olliieeee.acwiki.services;

import me.olliieeee.acwiki.types.ACItem;

import java.util.Set;

public interface Service<T extends ACItem> {
    void init();

    Set<T> getByName(String name);

    Set<T> getAll();
}
