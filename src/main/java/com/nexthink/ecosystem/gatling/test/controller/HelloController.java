package com.nexthink.ecosystem.gatling.test.controller;

import com.nexthink.ecosystem.gatling.test.service.MyService;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Controller("/hello")
public class HelloController {

    private MyService service;

    public HelloController (MyService service) {

        this.service = service;
    }

    @Get
    @Produces(MediaType.TEXT_PLAIN)
    public String index() {

        log.info("Using an injected by constructor service.");
        service.aMethod();

        return "Hello World";
    }
}