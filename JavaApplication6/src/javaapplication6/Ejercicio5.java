/*
 Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt().
 */
package javaapplication6;
import java.util.Scanner;

public class Ejercicio5 {

  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      int num, doble, triple;
      
      System.out.println("Ingrese un numero entero: ");
      num = input.nextInt();
      
     doble = num*2;
     triple = num*3;
     Double raiz = Math.sqrt(num);
     
      System.out.println("El doble del numero es: " + doble);
      System.out.println("El triple del numero es: " + triple);
      System.out.println("La raiz cuadrada del numero es: " + raiz);
    }
    
}
