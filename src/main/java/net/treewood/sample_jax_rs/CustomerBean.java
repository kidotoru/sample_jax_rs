/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.treewood.sample_jax_rs;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author taatan
 */
    @XmlRootElement(name = "xxx")
public class CustomerBean {
           public String name;
        public String address;

        public CustomerBean() {
        }
}
