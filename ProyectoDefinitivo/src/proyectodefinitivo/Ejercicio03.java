package proyectodefinitivo;
import java.util.Scanner;
/**EJERCICIO3 v1.0
 * 
 * Programa que calcula el cuadrado y el cubo de un número introducido por el usuario.
 * 
 * @author JC Romero
 */
public class Ejercicio03
{

    public static void main(String[] args)
    {        
        Scanner userInput = new Scanner(System.in);
        int number;
        
        System.out.println("Por favor, introduzca un número entero:");
        number = userInput.nextInt();
        
        System.out.println("El cuadrado de " + number + " es: " + number*number);
        System.out.println("El cubo de " + number + " es: " + number*number*number);
    }
}
