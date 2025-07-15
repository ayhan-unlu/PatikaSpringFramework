package com.ayhanunlu.qualifier;


import javax.enterprise.inject.Default;

@Default
public class Boss1 implements IBoss {

    //@Alternative: At a specific time only one alternative works and the rest inactive
    @Override
    public String version(String data) {
        return "Default Boss 1 Version: " + data;
    }

}
