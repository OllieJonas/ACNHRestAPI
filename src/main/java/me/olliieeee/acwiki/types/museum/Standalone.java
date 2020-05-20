package me.olliieeee.acwiki.types.museum;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor @Getter @Setter
public class Standalone implements MuseumItem {
    private String name;
    private String imageLink;
    private Integer price;
}
