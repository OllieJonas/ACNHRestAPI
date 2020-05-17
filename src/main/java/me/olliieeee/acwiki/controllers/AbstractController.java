package me.olliieeee.acwiki.controllers;

import java.util.concurrent.atomic.AtomicLong;

public abstract class AbstractController {
    private final AtomicLong count = new AtomicLong();

    public String prepareResponse(String original) {
        return original.replaceAll("[-_]", " ");
    }
}
