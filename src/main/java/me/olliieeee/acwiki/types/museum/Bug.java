package me.olliieeee.acwiki.types.museum;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor @Getter @Setter
public class Bug implements MuseumItem {
    private String name;
    private String imageLink;
    private Integer price;
    private String location;
    private List<Integer> times;

    @SerializedName("northern_months")
    private List<Integer> northernMonths;

    @SerializedName("southern_months")
    private List<Integer> southernMonths;
}
