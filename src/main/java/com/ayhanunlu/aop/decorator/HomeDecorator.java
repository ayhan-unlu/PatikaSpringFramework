package com.ayhanunlu.aop.decorator;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

@Decorator
abstract public class HomeDecorator implements IHome{

    private @Inject @Delegate
    IHome iHome;

    @Override
    public String paint(String data) {
        System.out.println("The Decorator was Here!!");
        String dataInformation=iHome.paint(data);
        if(dataInformation.equals("kodluyoruz")){
            dataInformation=dataInformation.toUpperCase();
        }
        return dataInformation;
    }
}
