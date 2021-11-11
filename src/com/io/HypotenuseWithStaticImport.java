package com.io;

public class HypotenuseWithStaticImport {

    public static void main(String[] args) {
        double side1, side2;
        double hypo;

        side1 = 3.0;
        side2 = 4.0;

        hypo = Math.sqrt(Math.pow(side1,2) + Math.pow(side2,2));

        System.out.println("Given sides of lengths "+side1+" and "+side2+" the hypotenuse is "+hypo);
    }
}
