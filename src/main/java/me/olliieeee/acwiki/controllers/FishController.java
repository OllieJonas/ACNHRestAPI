package me.olliieeee.acwiki.controllers;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import me.olliieeee.acwiki.services.FishService;
import me.olliieeee.acwiki.services.FishServiceImpl;
import me.olliieeee.acwiki.types.museum.Fish;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.HashSet;
import java.util.Objects;
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
    public Set<Fish> getFishByName(@PathVariable("name") String name, HttpServletRequest request) {
        System.out.println(request.getRemoteAddr());
        return service.getFishByName(prepareResponse(name));
    }

    @GetMapping(value = "/output")
    public Set<Fish> getOutputByName(
            @RequestParam("name") String name,
            @RequestParam("location") String location) {
        return service.getFishByName(name);
    }

    @GetMapping(value = "/{location/{location}")
    @ResponseStatus(HttpStatus.OK)
    public Set<Fish> getFish(@PathVariable("location") String location) {
        return service.getFishByLocation(location);
    }
}
