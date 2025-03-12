package org.example;


public class App {
    public static void main(String[] args) {
        Calculate calcInt = new Calculate();
        Calculate calcString = new Calculate();
        Calculate calcDouble = new Calculate();
        System.out.println(calcInt.add(5));
        System.out.println(calcString.add("piw"));
        System.out.println(calcDouble.add(123.3));
    }
}
