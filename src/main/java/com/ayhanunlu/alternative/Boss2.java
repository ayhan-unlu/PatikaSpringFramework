package com.ayhanunlu.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Boss2 implements IBoss {

    //@Alternative:
    @Override
    public String version(String data) {
        return "Boss 2 Version: " + data;
    }

}
