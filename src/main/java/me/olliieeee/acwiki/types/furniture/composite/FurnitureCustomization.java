package me.olliieeee.acwiki.types.furniture.composite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor @Getter @Setter
public class FurnitureCustomization {
    private String type;
    private int kits;
    private List<String> options;
}
