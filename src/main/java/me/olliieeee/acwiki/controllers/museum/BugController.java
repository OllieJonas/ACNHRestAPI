package me.olliieeee.acwiki.controllers.museum;

import me.olliieeee.acwiki.controllers.Controller;
import me.olliieeee.acwiki.services.Service;
import me.olliieeee.acwiki.services.museum.impl.BugServiceImpl;
import me.olliieeee.acwiki.types.museum.Bug;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bugs")
public class BugController extends CreatureController<Service<Bug>> {

    public BugController() {
        super(new BugServiceImpl());
    }

}
