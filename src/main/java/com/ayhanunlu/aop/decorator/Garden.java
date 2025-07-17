package com.ayhanunlu.aop.decorator;

public class Garden implements IHome {

    @Override
    public String paint(String data) {
        return data;
    }
}
