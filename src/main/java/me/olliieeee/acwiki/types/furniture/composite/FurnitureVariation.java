package me.olliieeee.acwiki.types.furniture.composite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor @Getter @Setter
public class FurnitureVariation {
    private String type;
    private List<String> options;
}
