package com.ayhanunlu.aop.decorator;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "decoratorBean")
@ApplicationScoped
public class DecoratorBean {

    @Inject
    IHome iHome;

    public String beanMethod(String data){
        return iHome.paint(data);
    }
}
