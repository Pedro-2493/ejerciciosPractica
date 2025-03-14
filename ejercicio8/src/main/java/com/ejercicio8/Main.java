package com.ejercicio8;

public class Main {
    public static void main(String[] args) {
          // Calculadora de tiempo
          int dias = 0;
          int horas = 0;
          int minutos = 60;
          int minutosRestantes = 0;
   
          horas = minutos / 60;
          minutosRestantes = minutos % 60;
          System.out.println(" El tiempo es de: " + horas + " horas " + minutosRestantes + " minutos");
   
          dias = minutos / (24 * 60);
   
          System.out.println(" El tiempo es de: " + dias + " dias " + horas + " horas " + minutos + " minutos");
   
   
 
    }
}