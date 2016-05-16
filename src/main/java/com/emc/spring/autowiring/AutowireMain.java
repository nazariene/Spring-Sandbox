/*
 * Copyright (c) 2002-2016 EMC Corporation All Rights Reserved
 */
package com.emc.spring.autowiring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireMain {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("autowiring.xml");
        context.registerShutdownHook();

        AutowireBean obj = (AutowireBean) context.getBean("autowireBeanByName");
        System.out.println(obj.getAutowireHelperBean());
        System.out.println(obj.getAutowireHelperBean().getProperty());

        /*AutowireBean obj1 = (AutowireBean) context.getBean("autowireBeanByType");
        System.out.println(obj1.getAutowireHelperBean());
        System.out.println(obj1.getAutowireHelperBean().getProperty());*/

        AutowireConstructorBean obj2 = (AutowireConstructorBean) context.getBean("autowireBeanConstructor");
        System.out.println(obj2.getAutowireHelperBean());
        System.out.println(obj2.getAutowireHelperBean().getProperty());
        System.out.println(obj2.getAutowireSubHelperBean());
        System.out.println(obj2.getAutowireSubHelperBean().getProperty());


    }
}
