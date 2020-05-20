package me.olliieeee.acwiki.types.furniture;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor @Getter @Setter
public class FurnitureHouse implements Furniture {
    private String name;
    private String imageLink;
    private Integer buyPrice;
    private Integer sellPrice;
    private String source;
    private List<Float> size;
}
