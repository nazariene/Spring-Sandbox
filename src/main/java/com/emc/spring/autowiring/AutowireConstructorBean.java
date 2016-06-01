/*
 * Copyright (c) 2002-2016 EMC Corporation All Rights Reserved
 */
package com.emc.spring.autowiring;

public class AutowireConstructorBean {

    private AutowireHelperBean autowireHelperBean;
    private AutowireAnotherHelperBean autowireAnotherHelperBean;

    public AutowireAnotherHelperBean getAutowireAnotherHelperBean() {
        return autowireAnotherHelperBean;
    }

    public AutowireHelperBean getAutowireHelperBean() {
        return autowireHelperBean;
    }
    public AutowireConstructorBean(AutowireHelperBean autowireHelperBean, AutowireAnotherHelperBean autowireAnotherHelperBean) {
        this.autowireHelperBean = autowireHelperBean;
        this.autowireAnotherHelperBean = autowireAnotherHelperBean;
    }
}
