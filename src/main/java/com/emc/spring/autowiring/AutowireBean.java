/*
 * Copyright (c) 2002-2016 EMC Corporation All Rights Reserved
 */
package com.emc.spring.autowiring;

public class AutowireBean {

    private AutowireHelperBean autowireHelperBean;
    private AutowireAnotherHelperBean autowireAnotherHelperBean;

    public AutowireHelperBean getAutowireHelperBean() {
        return autowireHelperBean;
    }

    public void setAutowireHelperBean(AutowireHelperBean autowireHelperBean) {
        this.autowireHelperBean = autowireHelperBean;
    }

    public AutowireAnotherHelperBean getAutowireAnotherHelperBean() {
        return autowireAnotherHelperBean;
    }

    public void setAutowireAnotherHelperBean(AutowireAnotherHelperBean autowireAnotherHelperBean) {
        this.autowireAnotherHelperBean = autowireAnotherHelperBean;
    }
}
