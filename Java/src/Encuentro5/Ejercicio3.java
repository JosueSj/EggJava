/*
 Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, etcétera 
(hasta 5 dígitos).
 */
package Encuentro5;

public class Ejercicio3 {

    public static void main(String[] args) {
        int[] vector = {1, 22, 333, 4444, 55555, 23};
        
     
        contarDigitos(vector);
        
    }
    public static void contarDigitos(int[] vector) {
    int[] contadores = new int[5];

    for (int i = 0; i < vector.length; i++) {
        int longitud = String.valueOf(vector[i]).length();

        switch (longitud) {
            case 1:
                contadores[0]++;
                break;
            case 2:
                contadores[1]++;
                break;
            case 3:
                contadores[2]++;
                break;
            case 4:
                contadores[3]++;
                break;
            case 5:
                contadores[4]++;
                break;
            default:
                break;
        }
    }

    System.out.println("Cantidad de números con 1 dígito: " + contadores[0]);
    System.out.println("Cantidad de números con 2 dígitos: " + contadores[1]);
    System.out.println("Cantidad de números con 3 dígitos: " + contadores[2]);
    System.out.println("Cantidad de números con 4 dígitos: " + contadores[3]);
    System.out.println("Cantidad de números con 5 dígitos: " + contadores[4]);
}
    /*public static int[] llenarVector(int[] vector) {
        Random rnd = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rnd.nextInt(10000);
        }
        return vector;
    }*/
    
}
