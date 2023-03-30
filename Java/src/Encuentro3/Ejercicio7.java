/*
 Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo
lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato fijo: 
tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser X y 
el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, 
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia 
distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas 
recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan 
las siguientes funciones de Java Substring(), Length(), equals().
 */
package Encuentro3;

import java.util.Scanner;

public class Ejercicio7 {
 
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        String cadena;
        int largo;
        int correcta=0, incorrecta=0;
        do {
            System.out.println("Escriba una cadena con el formato X...O");
            cadena = leer.nextLine();
            largo = cadena.length();

            if ( largo <= 5 && cadena.substring(0, 1).equals("X") && cadena.substring(4, 5).equals("O")) {
                correcta++;
                System.out.println("La secuencia es correcta");
            } else {
            incorrecta ++;
             System.out.println("La secuencia es incorrecta");
        }

        } while( !cadena.equals("&&&&&")) ;


        System.out.println("Las secuencias correctas fueron " + correcta);
        System.out.println("Las secuencias incorrectas fueron " + incorrecta);
    }   
    
}
