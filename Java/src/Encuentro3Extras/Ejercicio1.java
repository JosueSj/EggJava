/*
 Dado un tiempo en minutos, calcular su equivalente en días y horas. 
Por ejemplo, si el usuario ingresa 1600 minutos, 
el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package Encuentro3Extras;

import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min, hora, dia, minut;
        
        System.out.println("Ingrese los minutos: ");
        min = input.nextInt();
        
        
        hora = min / 60;
        dia = hora / 24;
        hora = hora % 24;
        minut = min%60;
        
        System.out.println(min + " minutos son equivalentes a " + dia + " días y " + hora + " horas " + minut + " Minutos");
        
       
    }
    
}
