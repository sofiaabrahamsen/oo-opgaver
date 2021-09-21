package com.company;

public class testLamp {

    public static void main(String[] args) {
        Lamp skrivebordsLampe = new Lamp(true);
        System.out.println("Skrivebordslampen er:");
        skrivebordsLampe.getIsLampOn();

        Lamp stueLampe = new Lamp();
        System.out.println("Stuelampen er:");
        stueLampe.getIsLampOn();
    }
}
