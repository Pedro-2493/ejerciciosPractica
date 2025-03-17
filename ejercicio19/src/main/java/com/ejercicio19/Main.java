package com.ejercicio19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Calculadora De Notas Ponderadas

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la nota de Exámenes (0-100): ");
        double examenes = sc.nextDouble();

        System.out.print("Ingrese la nota de Proyectos (0-100): ");
        double proyectos = sc.nextDouble();

        System.out.print("Ingrese la nota de Tareas (0-100): ");
        double tareas = sc.nextDouble();

        System.out.print("Ingrese la nota de Participación (0-100): ");
        double participacion = sc.nextDouble();

        double notaFinal = (examenes * 0.4) + (proyectos * 0.3) + (tareas * 0.2) + (participacion * 0.1);

        System.out.printf("\nNota Final del curso: %.2f%n", notaFinal);

    }
}
