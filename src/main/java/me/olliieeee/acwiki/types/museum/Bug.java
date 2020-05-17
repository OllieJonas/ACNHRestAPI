package me.olliieeee.acwiki.types.museum;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor @Getter @Setter
public class Bug {
    private String name;
    private String imageLink;
    private int price;
    private String location;
    private List<Integer> times;
    private List<Integer> northernMonths;
    private List<Integer> southernMonths;
}
