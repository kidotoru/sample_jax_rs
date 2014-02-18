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
        
        resources.add(net.treewood.sample_jax_rs.resource.MessageResource.class);
    }

}
