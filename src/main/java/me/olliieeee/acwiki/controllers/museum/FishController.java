package me.olliieeee.acwiki.controllers.museum;

import me.olliieeee.acwiki.controllers.Controller;
import me.olliieeee.acwiki.services.Service;
import me.olliieeee.acwiki.services.museum.impl.FishServiceImpl;
import me.olliieeee.acwiki.types.museum.Fish;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/fish")
public class FishController extends CreatureController<Service<Fish>> {

    public FishController() {
        super(new FishServiceImpl());
    }

    @GetMapping(value = "/range/months")
    @ResponseStatus(HttpStatus.OK)
    public Set<Fish> getFishByMonthRange(@RequestParam("start") int start, @RequestParam("end") int end) {
        return service.getAll().parallelStream().filter(
                fish -> fish.getNorthernMonths().get(0) <= start || fish.getNorthernMonths().get(fish.getNorthernMonths().size() - 1) >= end)
                .collect(Collectors.toSet());
    }

    @GetMapping(value = "/output")
    public Set<Fish> getOutput(
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "location", required = false) String location,
            @RequestParam(value = "price", required = false) Integer price,
            @RequestParam(value = "shadowsize", required = false) Integer shadowSize,
            @RequestParam(value = "month", required = false) Integer month) {
        return service.getByBasic(prepareResponse(name), location, price, shadowSize, month);
    }
}
