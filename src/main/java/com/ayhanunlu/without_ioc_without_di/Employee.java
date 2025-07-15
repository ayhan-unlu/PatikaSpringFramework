package com.ayhanunlu.without_ioc_without_di;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named(value = "employee_without_cdi")
@ApplicationScoped
public class Employee {

    private Boss boss;
//No argument constructor
    public Employee() {
        boss = new Boss();
    }

    public String getData(String data){
        return boss.version(data);
    }
}
