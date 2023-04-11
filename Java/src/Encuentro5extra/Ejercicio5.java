/*
 Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios y muestre la suma de sus elementos.
 */
package Encuentro5extra;

import java.util.Random;
import java.util.Scanner;



public class Ejercicio5 {

    public static void main(String[] args) {
       Random rand = new Random();
       Scanner input  = new Scanner(System.in);
       int N,M;
        System.out.println("Ingrese los valores de la matriz: ");
        N = input.nextInt();
        M = input.nextInt();
       int[][] matriz = new int[N][M];
        System.out.println("Llenando matriz de forma aleatoria");
        llenarMatriz(matriz, rand);
        mostrarMatriz(matriz);
        
        
    }
    
    public static void llenarMatriz(int[][]matriz, Random rand){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j]= rand.nextInt(10);
            }
        }
    }
    
   public static void mostrarMatriz(int[][] matriz){
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " \t");              
            }
            System.out.println();            
        }
    }
    
}
