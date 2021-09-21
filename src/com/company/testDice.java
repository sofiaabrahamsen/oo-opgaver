package com.company;

public class testDice {
    public static void main(String[] args) {
        Dice Dice = new Dice();
        Dice.roll();
        System.out.println("Det tilfældige terningkast er: " + Dice.getFaceValue());
    }
}
