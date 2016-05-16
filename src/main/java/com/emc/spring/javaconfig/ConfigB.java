/*
 * Copyright (c) 2002-2016 EMC Corporation All Rights Reserved
 */
package com.emc.spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

import java.util.Date;

@Configuration
@Import(ConfigA.class)
public class ConfigB {

    @Bean
    @Scope("prototype")
    public Date date() {
        return new Date();
    }
}
