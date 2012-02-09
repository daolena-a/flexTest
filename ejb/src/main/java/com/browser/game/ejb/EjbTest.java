package com.browser.game.ejb;

import javax.ejb.Stateless;
import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: adrien
 * Date: 9/23/11
 * Time: 4:30 PM
 * To change this template use File | Settings | File Templates.
 */
@Stateless(mappedName = "/browser/ejbTest")
public class EjbTest implements Serializable {
    public void sayHello(){
        System.out.println("test ejb");
    }

    public EjbTest() {
    }
}
