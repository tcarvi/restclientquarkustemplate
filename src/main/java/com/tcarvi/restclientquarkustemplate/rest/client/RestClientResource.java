package com.tcarvi.restclientquarkustemplate.rest.client;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import io.smallrye.mutiny.Uni;

@Path("/restClient")
public class RestClientResource implements RestClientResourceInterface {

    @Inject
    RestClientService restClientService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String restClientResourceExecution(){
        return restClientService.exec();
    }

    @GET
    @Path("/name/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getName(@PathParam String name) {
        return restClientService.exec(name);
    }

    @GET
    @Path("/name-async/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getNameAsync(@PathParam String name) {
        return restClientService.exec(name);
    }

    @GET
    @Path("/name-uni/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getNameMutiny(@PathParam String name) {
        return restClientService.exec(name);
    }

}
