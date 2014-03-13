package net.treewood.sample_jax_rs.bean;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kido
 */
@XmlRootElement(name="customerlist")
public class CustomerListBean {
    public List<CustomerBean> customer;
    
    public CustomerListBean(){
        this.customer = new ArrayList<>();
    }
            

}