package me.olliieeee.acwiki.controllers.museum;

import me.olliieeee.acwiki.controllers.Controller;
import me.olliieeee.acwiki.services.museum.StandaloneService;
import me.olliieeee.acwiki.services.museum.impl.StandaloneServiceImpl;
import me.olliieeee.acwiki.types.museum.Standalone;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/art/standalone")
public class StandaloneController extends Controller<Standalone> {

    public StandaloneController() {
        super(new StandaloneServiceImpl());
    }

}
