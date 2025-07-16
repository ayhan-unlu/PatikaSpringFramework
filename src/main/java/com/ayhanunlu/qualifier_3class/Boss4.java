package com.ayhanunlu.qualifier_3class;

@QualifierMultiple_3class(MoreOptionsEnum.THIRD)
public class Boss4 implements IBoss {

    //@Alternative: At a specific time only one alternative works and the rest inactive
    @Override
    public String version(String data) {
        return "QualifierMultiple ENUM THIRD Boss 4 Version: " + data;
    }

}
