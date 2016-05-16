/*
 * Copyright (c) 2002-2016 EMC Corporation All Rights Reserved
 */
package com.emc.spring.autowiring;

public class AutowireBean {

    private AutowireHelperBean autowireHelperBean;
    private AutowireSubHelperBean autowireSubHelperBean;

    public AutowireHelperBean getAutowireHelperBean() {
        return autowireHelperBean;
    }

    public void setAutowireHelperBean(AutowireHelperBean autowireHelperBean) {
        this.autowireHelperBean = autowireHelperBean;
    }

    public AutowireSubHelperBean getAutowireSubHelperBean() {
        return autowireSubHelperBean;
    }

    public void setAutowireSubHelperBean(AutowireSubHelperBean autowireSubHelperBean) {
        this.autowireSubHelperBean = autowireSubHelperBean;
    }
}
