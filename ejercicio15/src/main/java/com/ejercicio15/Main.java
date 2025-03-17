package com.ejercicio15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       //Calculadora De Descuento Por Lealtad
        Scanner sc = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Ingrese los años como cliente: ");
        int añosCliente = sc.nextInt();

        System.out.print("Ingrese el monto de su compra: $");
        double montoCompra = sc.nextDouble();

        double descuento = 0.0;

        // Calcular descuento basado en los años de cliente
        if (añosCliente >= 1 && añosCliente <= 2) {
            descuento = 0.05; 
        } else if (añosCliente >= 3 && añosCliente <= 5) {
            descuento = 0.10; 
        } else if (añosCliente > 5) {
            descuento = 0.15; 
        }

        // Aplicar descuento adicional si la compra supera $500
        if (montoCompra > 500) {
            descuento += 0.05; 
        }

        // Calcular el monto final después del descuento
        double montoFinal = montoCompra - (montoCompra * descuento);

        // Mostrar el resultado
        System.out.printf("Descuento aplicado: %.0f%%%n", descuento * 100);
        System.out.printf("Monto a pagar después del descuento: $%.2f%n", montoFinal);

    }
}