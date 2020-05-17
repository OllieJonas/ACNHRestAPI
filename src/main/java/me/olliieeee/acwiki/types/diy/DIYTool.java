package me.olliieeee.acwiki.types.diy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.print.DocFlavor;
import java.util.List;

@AllArgsConstructor @Getter @Setter
public class DIYTool {
    private String name;
    private String type;
    private String imageLink;
    private List<DIYMaterial> materials;
    private List<Float> size;
    private List<String> source;
    private int sellPrice;
    private boolean recipeItem;
}
