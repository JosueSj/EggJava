/*
 Elaborar un algoritmo en el cuál se ingrese 
    un número entre 1 y 10 y se muestre su equivalente en romano.
 */
package Encuentro3Extras;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String romano;
        int num;
        System.out.println("Ingrese un numero del 1 al 10: ");
        num = input.nextInt();
                
        switch (num) {
            case 1:
                romano = "I";
                break;
            case 2:
                romano = "II";
                break;
            case 3:
                romano = "III";
                break;
            case 4:
                romano = "IV";
                break;
            case 5:
                romano = "V";
                break;
            case 6:
                romano = "VI";
                break;
            case 7:
                romano = "VII";
                break;
            case 8:
                romano = "VIII";
                break;
            case 9:
                romano = "IX";
                break;
            case 10:
                romano = "X";
                break;
            default:
                romano = "Número inválido";
                break;
            }      
        System.out.println("El numero " + num + " convertivo a romando es: " + romano);
    }        
    
}
