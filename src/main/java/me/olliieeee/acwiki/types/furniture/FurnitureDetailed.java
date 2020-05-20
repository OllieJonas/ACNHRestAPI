package me.olliieeee.acwiki.types.furniture;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import me.olliieeee.acwiki.types.furniture.composite.FurnitureCustomization;
import me.olliieeee.acwiki.types.furniture.composite.FurnitureVariation;

import java.util.List;

@AllArgsConstructor @Getter @Setter
public class FurnitureDetailed implements Furniture {
    private String name;
    private String imageLink;
    private Integer buyPrice;
    private Integer sellPrice;
    private List<String> source;
    private FurnitureVariation variations;
    private FurnitureCustomization customization;
    private List<Float> size;
}
