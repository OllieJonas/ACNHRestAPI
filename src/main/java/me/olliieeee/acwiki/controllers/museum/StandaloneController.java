package me.olliieeee.acwiki.controllers.museum;

import me.olliieeee.acwiki.controllers.Controller;
import me.olliieeee.acwiki.services.Service;
import me.olliieeee.acwiki.services.museum.impl.StandaloneServiceImpl;
import me.olliieeee.acwiki.types.museum.Standalone;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/art/standalone")
public class StandaloneController extends Controller<Service<Standalone>> {

    public StandaloneController() {
        super(new StandaloneServiceImpl());
    }

}
