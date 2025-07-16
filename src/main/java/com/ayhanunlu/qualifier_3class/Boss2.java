package com.ayhanunlu.qualifier_3class;

@QualifierMultiple_3class(MoreOptionsEnum.FIRST)
public class Boss2 implements IBoss {

    //@Alternative: At a specific time only one alternative works and the rest inactive
    @Override
    public String version(String data) {
        return "QualifierMultiple ENUM FIRST Boss 2 Version: " + data;
    }

}
