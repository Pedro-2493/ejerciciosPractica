package com.ejercicio10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero ");
        int numero1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero ");
        int numero2 = sc.nextInt();
        System.out.println("Ingrese el operador ");
        String operador = sc.next();

        switch (operador) {
            case "+":
                System.out.println("la suma del numero 1 y el numero2 es: " + (numero1 + numero2));
                break;
            case "-":
                System.out.println("La resta del numero 1 y el numero 2 es: " + (numero1 - numero2));
                break;
            case "*":
                System.out.println("La multiplicacion del numero 1 y el numero 2 es: " + (numero1 * numero2));
                break;
            case "/":
                System.out.println("La division del numero 1 y el numero 2 es: " + (numero1 / numero2));
                break;

            default:
                System.out.println("El operador no es valido");

}

}

}
