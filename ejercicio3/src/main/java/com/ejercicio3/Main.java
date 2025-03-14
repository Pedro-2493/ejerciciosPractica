package com.ejercicio3;

public class Main {
    public static void main(String[] args) {
   
        //Temperatura y Estado Del Agua
   
        int temperatura = 150;
        
    if (temperatura <=0 ) {
        System.out.println("El agua esta en estado solido (hielo)");
    }else if (temperatura > 0 &&  temperatura <100) {
        System.out.println("El agua esta en estado liquido");
    } else {
        System.out.println("El agua esta en estado gaseoso (vapor)");
    }
    }
}