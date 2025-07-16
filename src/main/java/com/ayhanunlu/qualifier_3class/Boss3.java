package com.ayhanunlu.qualifier_3class;

@QualifierMultiple_3class(MoreOptionsEnum.SECOND)
public class Boss3 implements IBoss {

    //@Alternative: At a specific time only one alternative works and the rest inactive
    @Override
    public String version(String data) {
        return "QualifierMultiple ENUM SECOND Boss 3 Version: " + data;
    }

}
