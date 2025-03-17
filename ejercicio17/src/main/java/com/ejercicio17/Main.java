package com.ejercicio17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       //Operaciones Combinadas
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = sc.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = sc.nextDouble();

        System.out.print("Ingrese el tercer número: ");
        double num3 = sc.nextDouble();

        double suma = num1 + num2 + num3;
        double multiplicacion = num1 * num2 * num3;
        double promedio = suma / 3.0; 

       
        boolean promedioMayorQueSuma = promedio > suma;

        //Resultados
        System.out.println("\nResultados:");
        System.out.println("Suma: " + suma);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("Promedio: " + promedio);
        System.out.println("¿El promedio es mayor que la suma? " + promedioMayorQueSuma);
}

}