package com.tcarvi.restclientquarkustemplate.restclient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/restClient")
public class RestClientResource {

    @Inject
    RestClientService restClientService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String restClientResourceExecution(){
        return restClientService.exec();
    }

    // @GET
    // @Produces(MediaType.TEXT_PLAIN)
    // @Path("/{param}")
    // public String restClientResourceExecution(String param) {
    //     return restClientService.exec(param);
    // }

}
