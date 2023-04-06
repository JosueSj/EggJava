/*
 Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz. 
La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package Encuentro5;

import java.util.Random;

public class Ejercicio4 {

    public static void main(String[] args) {
        int[][] matriz = Matriz(4, 4);
        System.out.println("Matriz original:");
        mostrarMatriz(matriz);

        int[][] traspuesta = traspuestaMatriz(matriz);
        System.out.println("Matriz traspuesta:");
        mostrarMatriz(traspuesta);

    }

    public static int[][] Matriz(int filas, int columnas) {
        int[][] matriz = new int[filas][columnas];
        Random random = new Random();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }
        return matriz;
    }

        public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + "\t");//"\t" (se utiliza para tabular entre cadenas)
            }
            System.out.println();
        }
    }

    public static int[][] traspuestaMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] traspuesta = new int[columnas][filas];
        for (int j = 0; j < columnas; j++) {
            for (int i = 0; i < filas; i++) {
                traspuesta[j][i] = matriz[i][j];
            }
        }
        return traspuesta;
    }

}
