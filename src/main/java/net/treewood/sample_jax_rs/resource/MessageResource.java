package net.treewood.sample_jax_rs.resource;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import net.treewood.sample_jax_rs.bean.CustomerListBean;
import net.treewood.sample_jax_rs.service.MessageService;

import org.glassfish.jersey.server.mvc.Viewable;

/**
 * REST Web Service
 */
@Path("message")
public class MessageResource {

    @Inject
    private MessageService messageService;
    
    @Context
    private UriInfo context;

    public MessageResource() {
    }

    @GET
    @Path("list")
    @Produces(MediaType.TEXT_HTML)
    public Viewable getJSP() {
        List<String> messages = new ArrayList<>();
        messages.add("message1");
        messages.add("message2");
        messages.add("message3");
        System.out.println(context.getPath());
        return new Viewable("/list.jsp", messages);
    }

    @GET
    @Path("jsonresponse")
    @Produces(MediaType.APPLICATION_JSON)
    public CustomerListBean getJSON() {
        return this.messageService.getCustomer();
    }

    @GET
    @Path("xmlresponse")
    @Produces("application/xml")
    public CustomerListBean getXML() {
        return this.messageService.getCustomer();
    }
}
