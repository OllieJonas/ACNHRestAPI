package me.olliieeee.acwiki.types.diy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor @Getter @Setter
public class DIYOther {
    private String name;
    private String imageLink;
    private List<DIYMaterial> materials;
    private List<Float> size;
    private String source;
    private int sellPrice;
}
