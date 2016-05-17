/*
 * Copyright (c) 2002-2016 EMC Corporation All Rights Reserved
 */
package com.emc.spring.events;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class EventHandlerBean implements ApplicationListener {

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println(event.toString());

    }
}
