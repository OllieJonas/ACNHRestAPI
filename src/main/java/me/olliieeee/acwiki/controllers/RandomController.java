package me.olliieeee.acwiki.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class RandomController extends AbstractController {

    @GetMapping(value = "/wtfismyipbro")
    @ResponseStatus(HttpStatus.OK)
    public String getIP(HttpServletRequest request) {
        return request.getRemoteAddr();
    }

    @GetMapping(value = "/nulltestbro")
    @ResponseStatus(HttpStatus.OK)
    public String getNull(@RequestParam(value = "null", required = false) String nullCheck) {
        return nullCheck;
    }
}
