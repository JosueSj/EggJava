/*
Crear un programa que dado un número determine si es par o impar.
 */
package Encuentro3;

import java.util.Scanner;

public class Ejercicio1 {
  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        
        System.out.println("Ingrese un numero entero: ");
        num = input.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("El numero " + num + " es par.");
            
        }else{
            System.out.println("El numero " + num + " es impar");
        }
    }
    
}
