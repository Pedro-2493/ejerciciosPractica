package com.ejercicio9;

public class Main {
    public static void main(String[] args) {
               //calificacion de notas
   
               int nota = 0;
   
               if (nota >= 90) {
                   System.out.println("La nota es A ");
               } else if (nota >= 80) {
                   System.out.println("La nota es B ");
               } else if (nota >= 70) {
                   System.out.println("La nota es C ");
               } else if (nota >= 60) {
                   System.out.println("La nota es D ");
               } else {
                   System.out.println("La nota es F ");
                   
               }
    }
}