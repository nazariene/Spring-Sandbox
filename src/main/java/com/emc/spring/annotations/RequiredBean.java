/*
 * Copyright (c) 2002-2016 EMC Corporation All Rights Reserved
 */
package com.emc.spring.annotations;

import org.springframework.beans.factory.annotation.Required;

import javax.annotation.Resource;

public class RequiredBean {

    private String name;

    public String getName() {
        return name;
    }

    @Required
    @Resource(name = "autowiredStringBean") //autowire byName
    public void setName(String name) {
        this.name = name;
    }
}
