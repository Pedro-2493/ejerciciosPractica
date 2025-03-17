package com.ejercicio11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Dia de la semana
Scanner sc  = new Scanner(System.in);
System.out.println("Ingrese un dia de la semana (1-7): ");
int num1 = sc.nextInt();

switch (num1) {
    case 1:
        System.out.println("lunes");
        break;
        case 2:
        System.out.println("martes");
        break;
        case 3:
        System.out.println("miercoles");
        break;
        case 4:
        System.out.println("jueves");
        break;
        case 5:
        System.out.println("viernes");
        break;
        case 6:
        System.out.println("sabado");
        break;
        case 7:
        System.out.println("domingo");
        break;

    default:System.out.println("Dia no valido");
        break;
}

sc.close(); 



    }
}