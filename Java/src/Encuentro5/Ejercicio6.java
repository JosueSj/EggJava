/*
 Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas, sus 
columnas y sus diagonales son idénticas. Crear un programa que permita introducir un cuadrado por teclado y 
determine si este cuadrado es mágico o no. El programa deberá comprobar que los números introducidos son 
orrectos, es decir, están entre el 1 y el 9.
 */
package Encuentro5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Ejercicio6 {

    public static void main(String[] args) {
        boolean resultado;
        int [][] matriz = new int[3][3];
        llenarMatriz(matriz);
        mostrarMatriz(matriz);
        resultado = esMagico(matriz);
        if(resultado == true){
            System.out.println("La matriz es magica");
        }else{
            System.out.println("La matriz no es magica");
        }
                
        
        
    }
    
    public static void llenarMatriz(int [][] matriz){
    int[] numeros = {1,2,3,4,5,6,7,8,9};
    Random rand = new Random();
    for (int i = numeros.length - 1; i > 0; i--) {
        int j = rand.nextInt(i + 1);
        int aux = numeros[i];
        numeros[i] = numeros[j];
        numeros[j] = aux;
    }
    int contador = 0;
    System.out.println("Matriz");
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz.length; j++) {
            matriz[i][j] = numeros[contador];
            contador++;
        }            
    }
}
    /*
    public static void llenarMatriz(int [][] matriz){
        int[] numeros = {1,2,3,4,5,6,7,8,9};
        int contador = 0;
        Collections.shuffle(Arrays.asList(numeros));
        System.out.println("Matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = numeros[contador];
                contador++;
            }            
        }
    }*/
    
    public static void mostrarMatriz(int[][] matriz){
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " \t");              
            }
            System.out.println();            
        }
    }
    
    public static boolean esMagico(int[][]matriz){
        boolean valido;
        int sumaDiagonal1, sumaDiagonal2, sumaFila, sumaColumna, sumaMagica;
        sumaMagica = 15;
        valido = true;
        if (valido == true){
            sumaDiagonal1 = 0;
            sumaDiagonal2 = 0;
            for (int i = 0; i < 3; i++) {
                sumaFila = 0 ;
                sumaColumna = 0;
            
            for (int j = 0; j < 3; j++) {
                sumaFila += matriz[i][j];
                sumaColumna += matriz[j][i];
                if(i == j){
                    sumaDiagonal1 += matriz[i][j];
                }
                if(i+j == 3-1){
                    sumaDiagonal2 += matriz[i][j];
                }
                
            }
            if (sumaColumna != sumaMagica && sumaFila != sumaMagica){
            
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
