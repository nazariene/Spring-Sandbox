/*
 * Copyright (c) 2002-2016 EMC Corporation All Rights Reserved
 */
package com.emc.spring.autowiring;

public class AutowireConstructorBean {

    private AutowireHelperBean autowireHelperBean;
    private AutowireSubHelperBean  autowireSubHelperBean;

    public AutowireSubHelperBean getAutowireSubHelperBean() {
        return autowireSubHelperBean;
    }

    public AutowireHelperBean getAutowireHelperBean() {
        return autowireHelperBean;
    }
    public AutowireConstructorBean(AutowireHelperBean autowireHelperBean, AutowireSubHelperBean autowireSubHelperBean) {
        this.autowireHelperBean = autowireHelperBean;
        this.autowireSubHelperBean = autowireSubHelperBean;
    }
}
