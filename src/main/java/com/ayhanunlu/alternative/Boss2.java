package com.ayhanunlu.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Boss2 implements IBoss {

    //@Alternative: At a specific time only one alternative works and the rest inactive
    @Override
    public String version(String data) {
        return "Boss 2 Version: " + data;
    }

}
