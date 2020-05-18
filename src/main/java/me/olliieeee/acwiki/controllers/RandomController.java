package me.olliieeee.acwiki.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class RandomController extends AbstractController {

    @GetMapping(value = "/wtfismyipbro")
    @ResponseStatus(HttpStatus.OK)
    public String getIP(HttpServletRequest request) {
        return request.getRemoteAddr();
    }

    @GetMapping(value = "/echo/{echo}")
    @ResponseStatus(HttpStatus.OK)
    public String getEcho(@PathVariable(value = "echo") String echo) {
        return echo;
    }
}
