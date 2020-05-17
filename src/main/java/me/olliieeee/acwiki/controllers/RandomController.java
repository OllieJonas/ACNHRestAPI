package me.olliieeee.acwiki.controllers;

import me.olliieeee.acwiki.types.museum.Fish;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Set;

@RestController
public class RandomController extends AbstractController {

    @GetMapping(value = "/wtfismyipbro")
    @ResponseStatus(HttpStatus.OK)
    public String getIP(HttpServletRequest request) {
        return request.getRemoteAddr();
    }
}
