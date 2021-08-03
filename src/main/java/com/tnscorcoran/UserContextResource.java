package com.tnscorcoran;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

@Path("/corp/rest/v1/banks")
public class UserContextResource {


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{bankid}/usercontext/{userid}")                                   
    // /corp/rest/v1/banks/1/usercontext/10001
    // https://stackoverflow.com/questions/32367501/what-is-the-difference-between-pathparam-and-pathvariable
    
    public UserContext greeting(@PathParam String bankid, @PathParam String userid) {
        return new UserContext("Banking User Context Implementation", bankid, userid, "Tom Corcoran", "Customer");
    }
}