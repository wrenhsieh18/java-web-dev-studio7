package org.launchcode.studio7;

public abstract class BaseDisc implements OpticalDisc{

    private String capacity;

    public BaseDisc(String aCapacity) {
        capacity = aCapacity;
    }

    public String getCapacity() {
        return capacity;
    }

    //public abstract String getCapacity();

    //public abstract String read();

    //public abstract void write(String aData);
}
