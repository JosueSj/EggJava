
package Encuentro3Extras;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char letra;
        double costo, descuento;

        System.out.print("Ingrese la letra que representa la clase del socio (A, B o C): ");
        letra = input.next().charAt(0);
        System.out.print("Ingrese el costo del tratamiento: ");
        costo = input.nextDouble();

        descuento = 0;
        switch (letra) {
            case 'A':
                descuento = 0.5;
                break;
            case 'B':
                descuento = 0.35;
                break;
        }

        double importeAPagar = costo * (1 - descuento);
        System.out.println("El importe a pagar por el socio es de $" + importeAPagar);
    }
    
}
