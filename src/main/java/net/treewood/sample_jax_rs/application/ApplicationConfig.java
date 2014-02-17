package net.treewood.sample_jax_rs.application;

import java.util.Set;
import javax.ws.rs.core.Application;

@javax.ws.rs.ApplicationPath("rest")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);


        return resources;
    }

    private void addRestResourceClasses(Set<Class<?>> resources) {
        try {
            Class jsonProvider = Class.forName("org.glassfish.jersey.jackson.JacksonFeature");
            resources.add(jsonProvider);
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(getClass().getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        try {
            Class jspProvider = Class.forName("org.glassfish.jersey.server.mvc.jsp.JspMvcFeature");
            resources.add(jspProvider);
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(getClass().getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        resources.add(net.treewood.sample_jax_rs.resource.MessageResource.class);
    }

}
