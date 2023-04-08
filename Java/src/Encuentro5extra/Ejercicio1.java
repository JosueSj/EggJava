/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, 
con los valores ingresados por el usuario.
 */
package Encuentro5extra;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        int N, ResSuma;
        System.out.println("Ingrese en tamanio del vector: ");
        Scanner input = new Scanner (System.in);
        N = input.nextInt();
        int[] Vector = new int[N];
        llenarVector(Vector, N, input);
        ResSuma = sumaVector(Vector);
        System.out.println("La suma de los elementos del vector es: " + ResSuma);
        
    }

    
    public static void llenarVector(int[] vector, int elemento, Scanner input){
        
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese el valor para el elemento " + (i+1)+ ": ");
            vector[i] = input.nextInt();
            
        }
    }
    
    public static int sumaVector(int[]Vector){
    int suma=0;
        for (int i = 0; i < Vector.length; i++) {
            suma += Vector[i];
        }
        return suma;
    } 

    
}
