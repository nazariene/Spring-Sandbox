/*
 * Copyright (c) 2002-2016 EMC Corporation All Rights Reserved
 */
package com.emc.spring.events;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EventsMain {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(EventsConfig.class);

        ctx.start();
        ctx.stop();

        CustomEventPublisher cep = (CustomEventPublisher) ctx.getBean("customEventPublisher");
        cep.publish();
        cep.publish();
    }
}
