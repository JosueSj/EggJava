
package CondicionalesJava;

import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String letra;
        System.out.println("Ingrese una letra: ");
        letra = input.nextLine();
        //letra = letra.toUpperCase();
        
        
        if (letra.equalsIgnoreCase("A") || (letra.equalsIgnoreCase("E")) || (letra.equalsIgnoreCase("I")) || (letra.equalsIgnoreCase("O")) || (letra.equalsIgnoreCase("U"))){
        System.out.println("Es una vocal");
            
        }else{
                System.out.println("No es una vocal");
                }
        
        
    }
    
}
