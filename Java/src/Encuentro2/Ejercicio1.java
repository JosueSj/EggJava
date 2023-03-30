/*
Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de
la suma
*/
package javaapplication6;

import java.util.Scanner;

public class Ejercicio1 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2,resultado;
        
        System.out.println("Ingrese el primer numero: ");
        num1 = input.nextInt();
        
        System.out.println("Ingrese el segundo numero: ");
        num2 = input.nextInt();
        
        resultado = num1+num2;
        
        System.out.println("La suma entre el numero "+num1+" y " +num2+ " es: "+ resultado);
     
    }
    
}
