/*
 * Copyright (c) 2002-2016 EMC Corporation All Rights Reserved
 */
package com.emc.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class AutowiredBean {

    private String name;

    //Must be present in configuration. injected byType
    @Autowired(required = true)
    private TestBean address;

    //Ok if not present in configuration
    @Autowired(required = false)
    private TestBean2 address2;

    public String getName() {
        return name;
    }

    @Autowired(required = true)
    public void setName(String name) {
        this.name = name;
    }

    public TestBean getAddress() {
        return address;
    }

    public TestBean2 getAddress2() {
        return address2;
    }

    @Autowired
    public AutowiredBean(String name) {
        this.name = name;
    }


}
