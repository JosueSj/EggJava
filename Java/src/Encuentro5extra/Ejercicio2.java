/*
 Escriba un programa que averigüe si dos vectores de N enteros son iguales (la comparación deberá detenerse en cuanto se 
detecte alguna diferencia entre los elementos).

 */
package Encuentro5extra;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("\033[1;33mIngrese el tamanio de los vectores: \033[0m");
        n = input.nextInt();
        int[] vector1 = new int[n];
        int[] vector2 = new int[n];

        System.out.println("Ingrese los elementos del Vector 1: ");
        llenarVector(vector1, n, input);

        System.out.println("Ingrese los elementos del Vector 2: ");
        llenarVector(vector2, n, input);
        boolean iguales = compararVectores(vector1, vector2, n);
        if (iguales) {
            System.out.println("\033[1;32mLos vectores son iguales \033[0m");
        } else {
            System.out.println("\033[1;31mLos vectores no son \033[0m");
        }
    }

    public static void llenarVector(int[] vector, int n, Scanner input) {
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el elemento " + (i + 1) + ": ");
            vector[i] = input.nextInt();

        }
    }

    public static boolean compararVectores(int[] vector1, int[] vector2, int n) {

        for (int i = 0; i < n; i++) {
            if (vector1[i] != vector2[i]) {
                return false;
            }  
        } 
        return true;
    }

}
