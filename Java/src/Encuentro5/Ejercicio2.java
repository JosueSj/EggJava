/*
 
 */
package Encuentro5;

import java.util.Scanner;


public class Ejercicio2 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese tamaño del vector");
        int n = leer.nextInt();
        int[] vector = new int[n];
        
        for (int i = 0; i < n; i++) {
          vector[i] = (int) (Math.random()*10+1);  
            System.out.print(vector[i] + "/");
        }
        System.out.println("\nque numero quiere buscar dentro del vector?");
        int num = leer.nextInt();
        int count = 0;
        System.out.println("el numero " + num);
        for (int i = 0; i < n; i++) {
            if (num == vector[i]) {
                ++count;
                System.out.println("se encuentra en la posicion " + "\033[1;33m"+ i +"\033[0m");
                }
        }
        if (count == 0) {
             System.out.println("no pertenece al arreglo");
            }else if(count >= 2){
        System.out.println("se repite " + count + " veces");}
        
    }
    }
    
