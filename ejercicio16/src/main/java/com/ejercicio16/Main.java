package com.ejercicio16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Operador Ternario

               Scanner sc = new Scanner(System.in);

        // Expresión 1: Mayor o menor de edad
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        String estado = (edad >= 18) ? "mayor de edad" : "menor de edad";
        System.out.println("Eres " + estado);

        // Expresión 2: Número positivo, negativo o cero
        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();
        String resultado = (numero > 0) ? "positivo" : (numero < 0 ? "negativo" : "cero");
        System.out.println("El número es " + resultado);

    }
}