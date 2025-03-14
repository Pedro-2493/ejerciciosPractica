package com.ejercicio5;

public class Main {
    public static void main(String[] args) {
          // verificar numero positivo o negativo par o impar
          int numero = -4;

          if (numero > 0) {
              System.out.println("el numero es positivo");
          } else {
              System.out.println("el numero es negativo");
          }
   
          if (numero == 0) {
              System.out.println("el numero es 0");
          } else if (numero % 2 == 0) {
              System.out.println("el numero es par");
          } else {
              System.out.println("el numero es impar");
          }
   

    }
}