/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite 
números al usuario hasta que la suma de los números introducidos supere el límite inicial.

 */
package Encuentro3;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in) ;
        int limite, num, suma;
        limite = 100 ;
        num = 0;
        suma = num;
       
        while (suma < limite  ) {
            
            System.out.println("Ingrese un numero");
             num = leer.nextInt();
             suma += num; 
                        
        }
        if (suma == limite) {
            System.out.println("Se llego al limite");
        }else{
            System.out.println("Superaste el limite");
        }
        
    }
}
    
