package me.olliieeee.acwiki.controllers;

import me.olliieeee.acwiki.services.Service;
import me.olliieeee.acwiki.types.ACItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletResponse;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.zip.DataFormatException;

@ControllerAdvice
public abstract class Controller<T extends Service<? extends ACItem>> implements ApplicationEventPublisherAware {

    protected final AtomicLong count = new AtomicLong();
    protected ApplicationEventPublisher publisher;

    protected T service;

    public Controller(T service) {
        this.service = service;
        service.init();
    }

    public String prepareResponse(String original) {
        if (original == null) return null;
        return original.replace('_', ' ');
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }



    @GetMapping(value = "")
    @ResponseStatus(HttpStatus.OK)
    public Set<? extends ACItem> getAll() {
        return service.getAll();
    }

    @GetMapping(value = {"/{name}", "/name/{name}"})
    @ResponseStatus(HttpStatus.OK)
    public Set<? extends ACItem> getByName(@PathVariable("name") String name) {
        return service.getByName(prepareResponse(name));
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(DataFormatException.class)
    public @ResponseBody String handleDataFormat(DataFormatException ex, WebRequest request, HttpServletResponse response) {
        return ex.getMessage();
    }
}
