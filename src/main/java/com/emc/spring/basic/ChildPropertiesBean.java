/*
 * Copyright (c) 2002-2016 EMC Corporation All Rights Reserved
 */
package com.emc.spring.basic;

public class ChildPropertiesBean {

    private String property;
    private String property2;

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getProperty2() {
        return property2;
    }

    public void setProperty2(String property2) {
        this.property2 = property2;
    }

    public void nop() {
        System.out.println("Cant remove destroy, init methods! Only override");
    }
}
