package com.ayhanunlu.alternative;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "alternative_di")
@ApplicationScoped
public class Employee {

    @Inject
    private IBoss iBoss;

    //No argument constructor
    public Employee() {
   //     iBoss = new Boss();
    }

    public String getData(String data) {
        return iBoss.version(data);
    }
}
