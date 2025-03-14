package com.ejercicio4;

public class Main {
    public static void main(String[] args) {
      
        // Descuento de un producto
       int precio = 100;
       int descuento = 0;
       if (precio > 100) {
           descuento = (precio * 10 / 100);
           System.out.println("El precio original es: " + precio + " el descuento es: " + descuento
                   + " el precio final es: " + (precio - descuento));
       } else if (precio > 50) {
           descuento = (precio * 5 / 100);
           System.out.println("El precio original es: " + precio + " el descuento es: " + descuento
                   + " el precio final es: " + (precio - descuento));
       } else {
           System.out.println("El precio original es: " + precio + " el descuento es: " + descuento
                   + " el precio final es: " + (precio - descuento));
       }

    
    }
}