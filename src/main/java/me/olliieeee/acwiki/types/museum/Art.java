package me.olliieeee.acwiki.types.museum;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor @Getter @Setter
public class Art implements MuseumItem {

    private String name;

    private String realLink;

    private String fakeLink;

    private String description;
}
