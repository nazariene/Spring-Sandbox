/*
 * Copyright (c) 2002-2016 EMC Corporation All Rights Reserved
 */
package com.emc.spring;

import org.springframework.beans.factory.InitializingBean;

public class SinglePropertyBean implements InitializingBean {

    private String property;

    public SinglePropertyBean() {
        System.out.println("SinglePropertyBean : constructor");
    }
    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
        System.out.println("SinglePropertyBean : set property to " + property);
    }

    public void init() {
        System.out.println("SinglePropertyBean : init");
    }

    public void destroy() {
        System.out.println("SinglePropertyBean : destroy");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("SinglePropertyBean : All set");
    }
}
