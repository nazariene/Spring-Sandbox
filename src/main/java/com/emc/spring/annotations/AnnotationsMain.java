/*
 * Copyright (c) 2002-2016 EMC Corporation All Rights Reserved
 */
package com.emc.spring.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsMain {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("annotations.xml");
        context.registerShutdownHook();

        RequiredBean requiredBean = (RequiredBean) context.getBean("requiredBean");
        System.out.println(requiredBean.getName());

        AutowiredBean autowiredBean = (AutowiredBean) context.getBean("autowiredBean");
        System.out.println(autowiredBean.getName());
        System.out.println(autowiredBean.getAddress());

    }
}
