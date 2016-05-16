/*
 * Copyright (c) 2002-2016 EMC Corporation All Rights Reserved
 */
package com.emc.spring;

public class Main {

    public static void main(String[] args) {
    /*    AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        SinglePropertyBean obj = (SinglePropertyBean) context.getBean("singlePropertyBean");

        obj.setProperty("Property 1");
        System.out.println("GET: " + obj.getProperty());


        context.registerShutdownHook();*/

        Test test = Test.getInstance();
        System.out.println(test);
    }
}
