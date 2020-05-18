package me.olliieeee.acwiki.controllers;

import me.olliieeee.acwiki.services.museum.FishService;
import me.olliieeee.acwiki.services.museum.FishServiceImpl;
import me.olliieeee.acwiki.types.museum.Fish;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/fish")
public class FishController extends AbstractController {

    private static FishService service;
    private Logger logger = LoggerFactory.getLogger(FishController.class);

    public FishController() {
        logger.info("Loaded FishController");
        service = new FishServiceImpl();
        service.init();
    }

    @GetMapping(value = "")
    @ResponseStatus(HttpStatus.OK)
    public Set<Fish> getAll() {
        return service.getAll();

    }

    @GetMapping(value = {"/{name}", "/name/{name}"})
    @ResponseStatus(HttpStatus.OK)
    public Set<Fish> getFishByName(@PathVariable("name") String name) {
        return service.getByName(prepareResponse(name));
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
        return service.getOutputByBasic(prepareResponse(name), location, price, shadowSize, month);
    }
}
