package net.treewood.sample_jax_rs.resource;

import net.treewood.sample_jax_rs.bean.CustomerBean;
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
import javax.xml.bind.annotation.XmlRootElement;

import org.glassfish.jersey.server.mvc.Viewable;

/**
 * REST Web Service
 */
@Path("message")
public class MessageResource {

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
    @Path("json")
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> getJSON() {
        List<String> messages = new ArrayList<>();
        messages.add("message1");
        messages.add("message2");
        messages.add("message3");

        return messages;
    }

    @GET
    @Path("xml")
    @Produces("application/xml")
    public CustomerBean getXML() {
        CustomerBean c = new CustomerBean();
        c.address = "東京";
        c.name = "山田";

        return c;
    }
}
