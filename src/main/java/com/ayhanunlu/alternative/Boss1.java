package com.ayhanunlu.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Boss1 implements IBoss {

    //@Alternative:
    @Override
    public String version(String data) {
        return "Boss 1 Version: " + data;
    }

}
