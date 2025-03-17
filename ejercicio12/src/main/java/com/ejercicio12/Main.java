package com.ejercicio12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Catergoría De Edad
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();

        if (edad >= 0 && edad <= 2) {
            System.out.println("Es un bebé ");
        } else if (edad >= 3 && edad <= 12) {
            System.out.println("Es un niño ");
        } else if (edad >= 13 && edad <= 19) {
            System.out.println("Es un adolecente ");
        } else if (edad >= 20 && edad <= 64) {
            System.out.println("Es un adulto ");
        } else if (edad > 65) {
            System.out.println("Es un adulto mayor ");
        } else
            System.out.println("Edad no valida");

    }
}