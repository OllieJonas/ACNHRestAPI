package me.olliieeee.acwiki.types.museum;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor @Getter @Setter
public class Multipart {
    private String name;
    private int price;
    private List<Standalone> parts;
}
