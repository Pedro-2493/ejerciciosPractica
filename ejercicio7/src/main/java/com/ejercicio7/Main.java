package com.ejercicio7;

public class Main {
    public static void main(String[] args) {
                     // calculadora de IMC
                     double peso = 89;
                     double altura = 1.80;
                     double imc = peso / (altura * altura);
                     if (imc < 18.5) {
                         System.out.println("Bajo peso");
                     } else if (imc >= 18.5 || imc < 24.9) {
                         System.out.println("Normal");
                     } else if (imc >= 25 || imc < 29.9) {
                         System.out.println("Sobrepeso");
                     } else if (imc >= 30 || imc < 34.9) {
                         System.out.println("Obesidad");
                     }
              
                  
    }
}