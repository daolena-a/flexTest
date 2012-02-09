package com.browser.game.service;

import com.browser.game.ejb.EjbTest;

import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 * Created by IntelliJ IDEA.
 * User: adrien
 * Date: 9/29/11
 * Time: 10:14 AM
 * To change this template use File | Settings | File Templates.
 */
@Stateless
public class BrowserGameService {
    @EJB
    private EjbTest test;
    public void test(){
        System.out.println("granite ds service call");
        test.sayHello();
        
    }
}
