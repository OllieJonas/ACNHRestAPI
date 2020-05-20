package me.olliieeee.acwiki.services;

import me.olliieeee.acwiki.types.ACItem;
import org.springframework.stereotype.Repository;

import java.util.Set;

public interface Service<T extends ACItem> {
    void init();

    Set<T> getByName(String name);

    Set<T> getAll();

    default Set<T> getByBasic(String prepareResponse, String location, Integer price, Integer shadowSize, Integer month) {
        return null;
    }
}
