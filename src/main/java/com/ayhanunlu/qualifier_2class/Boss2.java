package com.ayhanunlu.qualifier_2class;

@QualifierMultiple_2class
public class Boss2 implements IBoss {

    //@Alternative: At a specific time only one alternative works and the rest inactive
    @Override
    public String version(String data) {
        return "QualifierMultiple Boss 2 Version: " + data;
    }

}
