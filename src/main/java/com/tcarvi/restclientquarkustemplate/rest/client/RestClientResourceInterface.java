package com.tcarvi.restclientquarkustemplate.rest.client;

import org.jboss.resteasy.annotations.jaxrs.PathParam;
import io.vertx.core.json.JsonObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

public interface RestClientResourceInterface {

    @GET
    @Produces("application/json")
    JsonObject restClientResourceExecution();

    @GET
    @Path("/name/{name}")
    @Produces("application/json")
    JsonObject getName(@PathParam String name);

    @GET
    @Path("/name-async/{name}")
    @Produces("application/json")
    JsonObject getNameAsync(@PathParam String name);

    @GET
    @Path("/name-uni/{name}")
    @Produces("application/json")
    JsonObject getNameMutiny(@PathParam String name);

    // @GET
    // @Produces(MediaType.TEXT_PLAIN)
    // @Path("/name/{name}")
    // public String restClientResourceExecution(String param) {
    //     return restClientService.exec(param);
    // }
}
