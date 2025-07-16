package com.ayhanunlu.qualifier_3class;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "qualifier3Cdi")
@ApplicationScoped
public class Employee {

    //Codes that will work on default
    //@Inject
    //private IBoss iBoss;


    //Qualifier Multiple codes

    /*
    //first option
    @QualifierMultiple_3class(MoreOptionsEnum.FIRST) // now uses the codes that qualifier multiple annotation produces
    @Inject
    private IBoss iBoss;
    */

    /*
    //second option
    @QualifierMultiple_3class(MoreOptionsEnum.SECOND) // now uses the codes that qualifier multiple annotation produces
    @Inject
    private IBoss iBoss;
    */


    //third option
    @QualifierMultiple_3class(MoreOptionsEnum.THIRD) // now uses the codes that qualifier multiple annotation produces
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
