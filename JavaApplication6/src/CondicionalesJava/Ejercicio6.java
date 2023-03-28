/*  Crear un programa que dado un numero determine si es par o impar. */
package CondicionalesJava;

import java.util.Scanner;

public class Ejercicio6 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        
        System.out.println("Ingrese un numero entero");
        num = input.nextInt();
        
         if (num % 2 == 0) {
            System.out.println(num + " es un número par.");
        } else {
            System.out.println(num + " es un número impar.");
        }
        
       
    }
    
}
