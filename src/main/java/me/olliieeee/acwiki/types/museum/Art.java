package me.olliieeee.acwiki.types.museum;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor @Getter @Setter
public class Art implements MuseumItem {
    private String name;
    private String realImage;
    private String fakeImage;
    private String description;
}
