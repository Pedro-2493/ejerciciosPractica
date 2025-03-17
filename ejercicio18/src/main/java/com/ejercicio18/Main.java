package com.ejercicio18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Verificador De Multiplo
 Scanner sc = new Scanner(System.in);

        // Solicitar un número al usuario
        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();

        boolean multiploDe2 = (numero % 2 == 0);
        boolean multiploDe3 = (numero % 3 == 0);
        boolean multiploDe5 = (numero % 5 == 0);

        System.out.println("\nResultados:");
        if (multiploDe2) {
            System.out.println(numero + " es múltiplo de 2.");
        }
        if (multiploDe3) {
            System.out.println(numero + " es múltiplo de 3.");
        }
        if (multiploDe5) {
            System.out.println(numero + " es múltiplo de 5.");
        }

        if (!multiploDe2 && !multiploDe3 && !multiploDe5) {
            System.out.println(numero + " no es múltiplo de 2, 3 ni 5.");
        }


    }
}