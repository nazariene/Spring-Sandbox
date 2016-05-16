/*
 * Copyright (c) 2002-2016 EMC Corporation All Rights Reserved
 */
package com.emc.spring.basic;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BasicMain {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("basic.xml");

        SinglePropertyBean obj = (SinglePropertyBean) context.getBean("singlePropertyBean");

        obj.setProperty("Property 1");
        System.out.println("GET: " + obj.getProperty());

        context.registerShutdownHook();
    }
}
