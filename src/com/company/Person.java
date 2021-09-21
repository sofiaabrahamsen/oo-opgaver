package com.company;

public class Person {

    private String navn;
    private int alder;

    public Person(String navn, int alder) {
        this.navn = navn;
        this.alder = alder;
    }

    public String getNavn() {
        return navn;
    }

    public int getAlder() {
        return alder;
    }

    public  String toString(){
        return "Navn: " + navn + " " + "Alder: " + alder;
    }

    public void hasBirthday() {
       alder = getAlder()+1;
    }
}
