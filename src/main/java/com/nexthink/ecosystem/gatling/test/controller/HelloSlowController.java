package com.nexthink.ecosystem.gatling.test.controller;

import com.nexthink.ecosystem.gatling.test.service.MyService;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Controller("/helloslow")
public class HelloSlowController {

    @Get
    @Produces(MediaType.TEXT_PLAIN)
    public String index() throws InterruptedException {

        log.info("Slow...");
        Thread.sleep(1199);

        return "Hello World";
    }
}