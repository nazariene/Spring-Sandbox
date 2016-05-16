/*
 * Copyright (c) 2002-2016 EMC Corporation All Rights Reserved
 */
package com.emc.spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigA {

    @Bean
    public String name() {
        return "name";
    }
}
