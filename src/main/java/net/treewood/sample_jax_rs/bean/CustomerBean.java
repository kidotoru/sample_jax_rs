package net.treewood.sample_jax_rs.bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "customer")
public class CustomerBean {

    public String name;
    public String address;

    public CustomerBean() {
    }
}
