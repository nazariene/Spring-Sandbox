/*
 * Copyright (c) 2002-2016 EMC Corporation All Rights Reserved
 */
package com.emc.spring.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;

public class JavaConfigMain {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(ConfigA.class);
        // now both beans A and B will be available...
        String a = ctx.getBean(String.class);
        System.out.println(a);


        //---

        ApplicationContext ctxB =
                new AnnotationConfigApplicationContext(ConfigB.class);
        // now both beans A and B will be available...
        String b = ctxB.getBean(String.class);
        System.out.println(b);
        Date dateb = ctxB.getBean(Date.class);
        System.out.println(dateb);
        Thread.sleep(1000);
        dateb = ctxB.getBean(Date.class);
        System.out.println(dateb);
    }
}
