/*
 * Copyright (c) 2002-2016 EMC Corporation All Rights Reserved
 */
package com.emc.spring.events;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EventsConfig {

    @Bean
    public EventHandlerBean eventHandlerBean() {
        return new EventHandlerBean();
    }

    @Bean
    public CustomEventPublisher customEventPublisher() {
        return new CustomEventPublisher();
    }
}
