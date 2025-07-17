package com.ayhanunlu.aop.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@InterceptorRoadCut
public class InterceptorRoadCutMainJob {

    @AroundInvoke
    public Object logging(InvocationContext context) {
        System.out.println("First Pace: " + context.getMethod().getName());

        //user:logged in?

        boolean isLogin = true; // true= needs to login first. roadCutter interceptor variable
        //JDBC : session logged in or not
        Object isContinue = null; // if not intercepted it will continue

        if (isLogin) {
            //first please log in
            System.out.println("Please log in first");
            return null;
        } else {
            try {
                isContinue = context.proceed(); // making it continue
                System.out.println("Second Pace: " + isContinue);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return isContinue;
        }

    }
}
