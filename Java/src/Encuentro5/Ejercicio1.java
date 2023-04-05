/*
Realizar un algoritmo que llene un vector con los 100 primeros números enteros 
y los muestre por pantalla en orden descendente.
 */
package Encuentro5;

public class Ejercicio1 {

    public static void main(String[] args) {
            int[] numeros = llenarVector();
        numerosDescendente(numeros);
    }

    public static int[] llenarVector() {
        int[] numeros = new int[100];
        for (int i = 0; i < 100; i++) {
            numeros[i] = i + 1;
        }
        return numeros;
    }

    public static void numerosDescendente(int[] numeros) {
        System.out.println("Números en orden descendente:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
        
        
/* segunda opc clase
        int[] vector = new int[101];

        for (int i = 100; i > 0; i--) {
            vector[i] = i;
            System.out.print(vector[i] + "/");
        }*/
    }
}
    
       




