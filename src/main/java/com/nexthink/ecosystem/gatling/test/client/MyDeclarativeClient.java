package com.nexthink.ecosystem.gatling.test.client;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Consumes;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Produces;
import io.micronaut.http.client.annotation.Client;


@Client
public interface MyDeclarativeClient {

    @Post(value = "/anendpoint")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    HttpResponse invokeToAnExternalEndpoint (@Body String whatever);


}
