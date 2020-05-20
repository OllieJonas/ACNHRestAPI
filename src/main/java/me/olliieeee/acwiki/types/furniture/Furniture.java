package me.olliieeee.acwiki.types.furniture;

import me.olliieeee.acwiki.types.ACItem;

import java.util.List;

public interface Furniture extends ACItem {

    String getImageLink();

    Integer getBuyPrice();

    Integer getSellPrice();

    List<Float> getSize();


}
