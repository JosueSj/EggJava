/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.
Nota: investigar la función toUpperCase() y toLowerCase() en Java
 */
package javaapplication6;
import java.util.Scanner;

public class Ejercicio3 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        String frase, mayusculas, minusculas;
        
        System.out.println("Ingrese una frase: ");
        frase = input.nextLine();
        
        mayusculas = frase.toUpperCase();
        minusculas = frase.toLowerCase();
        
        System.out.println("La frase en Mayusculas: " + mayusculas);
        System.out.println("La frase en Minusculas: " + minusculas);
        
      
    }
    
}
