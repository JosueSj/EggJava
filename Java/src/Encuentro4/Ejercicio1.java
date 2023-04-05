/*
 Crea una aplicación que le pida dos números al usuario y este pueda elegir 
entre sumar, restar, multiplicar y dividir. La aplicación debe tener una función
para cada operación matemática y deben devolver sus resultados para imprimirlos 
en el main.
 */
package Encuentro4;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        double num1, num2;
        double resultado;
        String opc;
        
        System.out.println("Calculadora. ");
        System.out.println("Ingrese el primer numero: ");
        num1 = input.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        num2 = input. nextDouble();
        
        System.out.println("Ingrese la operacion a realizar: "
                + "| + SUMA"
                + "| - RESTAR"
                + "| * MULTIPLICACION"
                + "| / DIVISION");
        System.out.println("Que opareacio desea realizar? :");
        opc = input.next();
        
        switch (opc) {
            case "+":
                System.out.println("La suma es: " + sumar(num1, num2));
                
                break;
            case "-":
                System.out.println("La resta es: " + restar(num1, num2));
                
                break;
            case "*":
                System.out.println("La multiplicacion es: "+ multiplicar(num1, num2));
                
                break;
            case "/":
                System.out.println("La division es: " + dividir(num1, num2));
                
                break;
            default:
                System.out.println("Operacion invalida!");
        }
        
    }
    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }

    public static double restar(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public static double dividir(double num1, double num2) {
        return num1 / num2;
    }
    
}
