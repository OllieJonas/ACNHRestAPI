package me.olliieeee.acwiki.types;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Villager implements ACItem {
    private String name;
    private String imageLink;
    private String personality;
    private String gender;
    private String birthday;
    private String catchPhrase;
}
