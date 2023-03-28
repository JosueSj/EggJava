/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo
muestre por pantalla.
*/
package javaapplication6;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        String name;
        
        System.out.println("Ingrese un nombre: ");
        name = input.nextLine();
        
        System.out.println("El nombre ingresado fue: " + name);
    
    }
}
