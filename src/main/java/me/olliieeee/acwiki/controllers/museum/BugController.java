package me.olliieeee.acwiki.controllers.museum;

import me.olliieeee.acwiki.controllers.Controller;
import me.olliieeee.acwiki.services.museum.BugService;
import me.olliieeee.acwiki.services.museum.impl.BugServiceImpl;
import me.olliieeee.acwiki.types.museum.Bug;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/bugs")
public class BugController extends Controller<Bug> {

    public BugController() {
        super(new BugServiceImpl());
    }

}
