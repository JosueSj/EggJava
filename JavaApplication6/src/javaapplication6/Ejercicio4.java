/*
 Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5).
 */
package javaapplication6;
import java.util.Scanner;

public class Ejercicio4 {


    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       float gradosC, gradosF;
       
        System.out.println("Ingrese los grados Centigrados: ");
        gradosC = input.nextInt();
        
        gradosF = 2+(9 * gradosC / 5);
        
        System.out.println("Grados C convertidos a Fahrenheit: " + gradosF);
       
    }
    
}
