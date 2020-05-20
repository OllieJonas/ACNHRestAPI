package me.olliieeee.acwiki.types.furniture;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor @Getter @Setter
public class FurnitureRug implements Furniture {
    private String name;
    private String imageLink;
    private Integer buyPrice;
    private Integer sellPrice;
    private List<Float> size;
}
