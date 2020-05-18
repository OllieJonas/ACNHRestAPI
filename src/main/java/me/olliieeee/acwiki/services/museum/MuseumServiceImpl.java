package me.olliieeee.acwiki.services.museum;

import lombok.Getter;
import me.olliieeee.acwiki.types.museum.MuseumItem;

import java.util.Set;
import java.util.function.Predicate;

public abstract class MuseumServiceImpl<T extends MuseumItem> {

    @Getter
    protected Set<T> set;

}
