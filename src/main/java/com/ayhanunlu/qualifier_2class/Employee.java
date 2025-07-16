package com.ayhanunlu.qualifier_2class;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "qualifierCdi")
@ApplicationScoped
public class Employee {

    //Codes that will work on default
    @Inject
    @QualifierMultiple_2class // now uses the codes that qualifier multiple annotation produces
    private IBoss iBoss;

    //No argument constructor
    public Employee() {
   //     iBoss = new Boss();
    }

    public String getData(String data) {
        return iBoss.version(data);
    }
}
