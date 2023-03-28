/* Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa 
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar 
la función equals() en Java. */
package CondicionalesJava;

import java.util.Scanner;

public class Ejercicio7 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String frase;
        
        System.out.println("Ingrese una frase: ");
        frase = input.nextLine();
        
        if (frase.equals("eureka")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
        
    }
    
}
