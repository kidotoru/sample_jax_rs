/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.treewood.sample_jax_rs;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.server.mvc.Viewable;


/**
 * REST Web Service
 *
 * @author taatan
 */
@Path("hello")
public class GenericResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
    }

    /**
     * Retrieves representation of an instance of net.treewood.sample_jax_rs.GenericResource
     * @return an instance of java.lang.String
     */
    @GET
     @Path("list")
    @Produces(MediaType.TEXT_HTML)
    public Viewable  getText() {
        List<String> messages = new ArrayList<String>();
        messages.add("message1");
        messages.add("message2");
        messages.add("message3");

        return new Viewable("/list.jsp", messages);
    }

    /**
     * PUT method for updating or creating an instance of GenericResource
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("text/plain")
    public void putText(String content) {
    }
}
