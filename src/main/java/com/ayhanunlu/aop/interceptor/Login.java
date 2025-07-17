package com.ayhanunlu.aop.interceptor;

@InterceptorRoadCut
public class Login {

    public String isLoginMethod(String data) {
        return "isLoginData: " + data;
    }
}
