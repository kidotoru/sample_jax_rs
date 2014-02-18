/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
    public List<CustomerBean> customerlist;
    
    public CustomerListBean(){
        this.customerlist = new ArrayList<>();
    }
            

}