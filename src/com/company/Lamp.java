package com.company;

public class Lamp {
    boolean isLampOn;

    public Lamp(boolean isLampOn) {
        this.isLampOn = isLampOn;
    }

    public Lamp() {
        this.isLampOn = false;
    }

    public void trykPåKontakt() {
        if (isLampOn == true) {
            isLampOn = false;
        } else {
            isLampOn = true;
        }
    }
    public boolean getIsLampOn() {
        if(isLampOn == true) {
            System.out.println("tændt");
            return isLampOn;
           } else {
            System.out.println("slukket");
            return isLampOn;
        }
    }
}
