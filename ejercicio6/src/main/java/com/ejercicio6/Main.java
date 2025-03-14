package com.ejercicio6;

public class Main {
    public static void main(String[] args) {
                 // conversor de temperaturas
                 int temperaturaC = 100;
                 int temperaturaF = 250;
                 temperaturaF = (temperaturaC * 9 / 5) + 32;
                 temperaturaC = (temperaturaF - 32) * 5 / 9;
                 System.out.println("la temperatura en grados Fahrenheit es: " + temperaturaF);
                 System.out.println("la temperatura en grados Celsius es: " + temperaturaC);
          

    }
}