package com.ejercicio20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // Validador De Triangulo

       Scanner sc = new Scanner(System.in);

        // Solicitar las longitudes al usuario
        System.out.print("Ingrese el primer lado: ");
        double lado1 = sc.nextDouble();

        System.out.print("Ingrese el segundo lado: ");
        double lado2 = sc.nextDouble();

        System.out.print("Ingrese el tercer lado: ");
        double lado3 = sc.nextDouble();

        // Verificar si pueden formar un triángulo (Desigualdad Triangular)
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            // Clasificación del triángulo
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("El triángulo es EQUILÁTERO (tres lados iguales).");
            } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                System.out.println("El triángulo es ISÓSCELES (dos lados iguales).");
            } else {
                System.out.println("El triángulo es ESCALENO (ningún lado igual).");
            }
        } else {
            System.out.println("Las longitudes ingresadas NO pueden formar un triángulo.");
        }
    }
}