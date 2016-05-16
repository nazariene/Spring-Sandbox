/*
 * Copyright (c) 2002-2016 EMC Corporation All Rights Reserved
 */
package com.emc.spring.collections;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionsMain {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("collections.xml");
        context.registerShutdownHook();

        InjectingCollectionsBean jc=(InjectingCollectionsBean)context.getBean("injectingCollectionsBean");

        System.out.println(jc.getAddressList());
        System.out.println(jc.getAddressSet());
        System.out.println(jc.getAddressMap());
        System.out.println(jc.getAddressProps());
    }
}
