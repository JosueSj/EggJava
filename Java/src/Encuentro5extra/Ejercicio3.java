/*
 Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro. 
Después haremos otra función o procedimiento que imprima el vector.
 */
package Encuentro5extra;

import java.util.Random;

public class Ejercicio3 {

    public static void main(String[] args) {
        int[] vector = new int[10];
        llenarVector(vector);
        mostrarVector(vector);
        
    }
    public static void llenarVector(int[]vector){
        Random random = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i]= random.nextInt(20);
        }
    }
    
    public static void mostrarVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]+"\t");
        }
    }
    
}
