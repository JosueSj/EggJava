/*
Crea una aplicación que a través de una función nos convierta una cantidad de 
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes 
o libras. La función tendrá como parámetros, la cantidad de euros y la moneda a 
convertir que será una cadena, este no devolverá ningún valor y mostrará un mensaje
indicando el cambio (void).

El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package Encuentro4;
import java.util.Scanner;
public class Ejericicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cantidad;
        String moneda;
        System.out.println("Ingrese la cantidad de euros a convertir: ");
        cantidad = input.nextDouble();
        input.nextLine();
        System.out.println("Introduce la moneda a la que deseas convertir (libra, dolares o yenes) : ");
        moneda = input.nextLine();
        
        
    }
    public static void convertirDivisa(double cantidad, String moneda){
    double cambio = 0;
    
        switch (moneda) {
            case "libras":
                cambio = 0.86;
                
                break;
            case "dolares":
                cambio = 1.28611;
                
                break;
            case "yenes":
                cambio = 129.852;
                
                break;
            default:
                System.out.println("La moneda indicada no es validad");
                return;
        }
        double resultado = cantidad * cambio;
        System.out.println(cantidad + " euros son equivalentes a " + resultado + " " + moneda + ".");
    }
    
}
