package com.emc.spring.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class AutowireBean2 {

    private AutowireParentHelper autowireParentHelper;
    private AutowireChildHelper autowireChildHelper;

    public AutowireParentHelper getAutowireParentHelper() {
        return autowireParentHelper;
    }

    @Autowired
    @Qualifier("bean1")
    public void setAutowireParentHelper(AutowireParentHelper autowireParentHelper) {
        this.autowireParentHelper = autowireParentHelper;
    }

    public AutowireChildHelper getAutowireChildHelper() {
        return autowireChildHelper;
    }

    @Autowired
    @Qualifier("bean2")
    public void setAutowireChildHelper(AutowireChildHelper autowireChildHelper) {
        this.autowireChildHelper = autowireChildHelper;
    }
}
