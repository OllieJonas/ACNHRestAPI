package me.olliieeee.acwiki.types.furniture;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor @Getter @Setter
public class FurnitureDetailed {
    private String name;
    private String imageLink;
    private int buyPrice;
    private int sellPrice;
    private String source;
    private FurnitureVariation variations;
    private FurnitureCustomization customization;
    private List<Float> size;
}
