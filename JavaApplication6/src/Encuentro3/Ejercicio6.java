/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla 
el siguiente menú:El usuario deberá elegir una opción y el programa deberá mostrar el resultado 
por pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5. 
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente,
se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? 
Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar 
el menú.
MENU
1. Sumar.
2. Restar.
3. Multiplicar.
4. Dividir.
5. Salir.
Elija una opcion:

 */
package Encuentro3;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, opcion, resultado;
        char confirmacion;

        do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elija opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el primer número: ");
                    num1 = entrada.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = entrada.nextInt();
                    resultado = num1 + num2;
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;

                case 2:
                    System.out.print("Ingrese el primer número: ");
                    num1 = entrada.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = entrada.nextInt();
                    resultado = num1 - num2;
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;

                case 3:
                    System.out.print("Ingrese el primer número: ");
                    num1 = entrada.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = entrada.nextInt();
                    resultado = num1 * num2;
                    System.out.println("El resultado de la multiplicación es: " + resultado);
                    break;

                case 4:
                    System.out.print("Ingrese el primer número: ");
                    num1 = entrada.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = entrada.nextInt();
                    resultado = num1 / num2;
                    System.out.println("El resultado de la división es: " + resultado);
                    break;

                case 5:
                    System.out.print("¿Está seguro que desea salir del programa (S/N)? ");
                    confirmacion = entrada.next().charAt(0);
                    if (confirmacion == 'S' || confirmacion == 's') {
                        System.out.println("¡Hasta pronto!");
                        System.exit(0);
                    }
                    break;

                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 5);
    }
    
}
