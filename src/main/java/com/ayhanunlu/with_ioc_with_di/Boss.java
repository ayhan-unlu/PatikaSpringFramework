package com.ayhanunlu.with_ioc_with_di;

public class Boss implements IBoss {

    @Override
    public String version(String data) {
        return "Version: " + data;
    }

}
