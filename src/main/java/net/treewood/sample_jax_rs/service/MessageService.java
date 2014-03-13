package net.treewood.sample_jax_rs.service;

import javax.ejb.Stateless;
import net.treewood.sample_jax_rs.bean.CustomerBean;
import net.treewood.sample_jax_rs.bean.CustomerListBean;

/**
 *
 * @author kido
 */
@Stateless
public class MessageService {
    
    public CustomerListBean getCustomer(){
                
        CustomerListBean list = new CustomerListBean();
        
        CustomerBean c = new CustomerBean();
        c.address = "東京";
        c.name = "山田";

        list.customer.add(c);
        list.customer.add(c);
        list.customer.add(c);
        return list;
    }
}
