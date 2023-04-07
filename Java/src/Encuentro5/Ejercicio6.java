/*
 Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas, sus 
columnas y sus diagonales son idénticas. Crear un programa que permita introducir un cuadrado por teclado y 
determine si este cuadrado es mágico o no. El programa deberá comprobar que los números introducidos son 
orrectos, es decir, están entre el 1 y el 9.
 */
package Encuentro5;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tamanio;
        boolean resultado;
        System.out.println("Ingrese el tamnio del cuadrado: ");
        tamanio = input.nextInt();
        int [][] matriz = new int [tamanio][tamanio];
        llenarMatriz(matriz);
        mostrarMatriz(matriz);
        resultado = esMagico(matriz, tamanio);
        if(resultado == true){
            System.out.println("La matriz es magica");
        }else{
            System.out.println("La matriz no es magica");
        }
                
        
        
    }
    public static void llenarMatriz(int [][] matriz){
        Random random = new Random();
        System.out.println("Matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = random.nextInt(9);                
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
    
    public static boolean esMagico(int[][]matriz, int tamanio){
        boolean valido;
        int sumaDiagonal1, sumaDiagonal2, sumaFila, sumaColumna, sumaMagica;
        sumaMagica = 15;
        valido = true;
        if (valido == true){
            sumaDiagonal1 = 0;
            sumaDiagonal2 = 0;
            for (int i = 0; i < tamanio; i++) {
                sumaFila = 0 ;
                sumaColumna = 0;
            
            for (int j = 0; j < tamanio; j++) {
                sumaFila += matriz[i][j];
                sumaColumna += matriz[i][j];
                if(i == j){
                    sumaDiagonal1 += matriz[i][j];
                }
                if(i+j == tamanio -1){
                    sumaDiagonal2 += matriz[i][j];
                }
                
            }
            if ((sumaColumna != sumaMagica) && (sumaFila != sumaMagica)){
            
            valido = false;
            }
            if (sumaDiagonal1 != sumaMagica || sumaDiagonal2 != sumaMagica) {
            
            valido = false;
        }
            
            
        }
        
        }else{
            valido = true;
            }
            
        
        
        return valido;
    } 
    
}
