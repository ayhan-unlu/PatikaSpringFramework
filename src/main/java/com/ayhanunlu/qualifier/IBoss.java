package com.ayhanunlu.qualifier;

public interface IBoss {

    //@Alternative: At a specific time only one alternative works and the rest inactive
    //@Qualifier  : At a specific time more than one projects can be active but default can be selected.

    public String version(String data);
}
