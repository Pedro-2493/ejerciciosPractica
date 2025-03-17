package com.ejercicio14;

import java.util.Scanner;

public class Main {

    //Año Bisiesto
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Ingrese un año");
      int año = sc.nextInt();

      if ((año % 4 == 0  && año % 100 != 0) || (año % 400 == 0))  {
        System.out.println(año + " Es año bisiesto ");
      }else System.out.println(año + " No es año bisiesto ");
      
      
      
      
    }
}