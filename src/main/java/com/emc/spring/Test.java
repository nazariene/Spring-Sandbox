/*
 * Copyright (c) 2002-2016 EMC Corporation All Rights Reserved
 */
package com.emc.spring;

public class Test {

    private static Test instance;
    static {
        new Test();
    }
    private Test() {
        instance = this;
    }

    public static Test getInstance() {
        return instance;
    }

}
