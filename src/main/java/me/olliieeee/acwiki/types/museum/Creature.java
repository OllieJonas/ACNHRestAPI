package me.olliieeee.acwiki.types.museum;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public interface Creature extends MuseumItem {
    Integer getPrice();

    String getLocation();

    List<Integer> getTimes();

    List<Integer> getNorthernMonths();

    List<Integer> getSouthernMonths();

}
