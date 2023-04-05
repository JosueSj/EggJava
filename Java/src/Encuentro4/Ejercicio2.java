/*
 Diseñe una función que pida el nombre y la edad de N personas e imprima los 
datos de las personas ingresadas por teclado e indique si son mayores o menores
de edad. Después de cada persona, el programa debe preguntarle al usuario si 
quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra 
“No”.
 */
package Encuentro4;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;
        
        System.out.println("Ingrese la cantidad de personas: ");
        N = input.nextInt();
        input.nextLine();  // Consumir el salto de línea
        ingresarPersonas(N, input);
    }
    public static void ingresarPersonas(int N, Scanner input) {
    String[] nombres = new String[N];
    int[] edades = new int[N];
    for (int i = 0; i < N; i++) {
        System.out.println("\033[1;33m"+"Ingrese el nombre de la persona " + (i+1) + ":"+"\033[0m");
        nombres[i] = input.nextLine();
        System.out.println("\033[1;33m"+"Ingrese la edad de " + nombres[i] + ":"+"\033[0m");
        edades[i] = input.nextInt();
        input.nextLine(); // Consumir el salto de línea
        if (esMayorDeEdad(edades[i])) {
            System.out.println("\033[1;32m" + nombres[i] + " es mayor de edad."+"\033[0m");
        } else {
            System.out.println("\033[1;31m" + nombres[i] + " es menor de edad."+"\033[1;31m");
        }
        System.out.println("¿Desea ingresar otra persona? (Sí/No)");
        String opcion = input.nextLine();
        if (opcion.equalsIgnoreCase("No")) {
            break;
        }
    }
}
    public static boolean esMayorDeEdad(int edad) {
        return edad >= 18;
    }
    
}
