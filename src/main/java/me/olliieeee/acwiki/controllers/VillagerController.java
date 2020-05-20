package me.olliieeee.acwiki.controllers;

import me.olliieeee.acwiki.services.Service;
import me.olliieeee.acwiki.services.VillagerService;
import me.olliieeee.acwiki.services.VillagerServiceImpl;
import me.olliieeee.acwiki.types.Villager;
import me.olliieeee.acwiki.types.museum.Fish;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/villagers")
public class VillagerController extends Controller<Service<Villager>> {

    public VillagerController() {
        super(new VillagerServiceImpl());
    }

}
