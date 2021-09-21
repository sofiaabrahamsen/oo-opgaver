package com.company;

public class Testperson {

    public static void main(String[] args) {
        Person Person = new Person ("Sofia", 23);
        System.out.println(Person.toString());
        Person.hasBirthday();
        System.out.println("Din alder næste gang du har fødselsdag: " + Person.getAlder());
    }
}
