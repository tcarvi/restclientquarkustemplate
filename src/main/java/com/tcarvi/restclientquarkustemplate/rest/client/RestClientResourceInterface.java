package com.tcarvi.restclientquarkustemplate.rest.client;

import org.jboss.resteasy.annotations.jaxrs.PathParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@RegisterRestClient
public interface RestClientResourceInterface {

    @GET
    @Produces("application/json")
    String restClientResourceExecution();

    @GET
    @Path("/name/{name}")
    @Produces("application/json")
    String name(@PathParam String name);

    @GET
    @Path("/name-async/{name}")
    @Produces("application/json")
    String nameAsync(@PathParam String name);

    @GET
    @Path("/name-uni/{name}")
    @Produces("application/json")
    String nameMutiny(@PathParam String name);

    // @GET
    // @Produces(MediaType.TEXT_PLAIN)
    // @Path("/name/{name}")
    // public String restClientResourceExecution(String param) {
    //     return restClientService.exec(param);
    // }
}
