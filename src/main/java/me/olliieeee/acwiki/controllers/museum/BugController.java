package me.olliieeee.acwiki.controllers.museum;

import me.olliieeee.acwiki.controllers.AbstractController;
import me.olliieeee.acwiki.services.museum.BugService;
import me.olliieeee.acwiki.services.museum.impl.BugServiceImpl;
import me.olliieeee.acwiki.types.museum.Bug;
import me.olliieeee.acwiki.types.museum.Fish;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/bugs")
public class BugController extends AbstractController {

    private BugService service;

    public BugController() {
        service = new BugServiceImpl();
        service.init();
    }


    @GetMapping(value = "")
    @ResponseStatus(HttpStatus.OK)
    public Set<Bug> getAll() {
        return service.getAll();
    }


    @GetMapping(value = {"/{name}", "/name/{name}"})
    @ResponseStatus(HttpStatus.OK)
    public Set<Bug> getFishByName(@PathVariable("name") String name) {
        return service.getByName(prepareResponse(name));
    }
}
