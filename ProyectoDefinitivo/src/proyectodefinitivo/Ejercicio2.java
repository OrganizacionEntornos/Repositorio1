package proyectodefinitivo;
/**
 * @author SergioBatuecas
 * 
 * Añadida clase y método para calcular el cambio de una cantidad de dinero dada por el usuario.
 */

import java.util.Scanner;
public class Ejercicio2 
{
    public static void main(String[] args) 
    {
        int money;
        int of50, of20, of10, of5, of2, of1;
        
        Scanner userInput = new Scanner (System.in);
        
        System.out.println("Por favor, indique una cantidad de dinero");
        money = userInput.nextInt();//Añado comentario para declarar la variable que añade el usuario
        of50 = money/50;
        of20 = (money%50)/20;
        of10 = ((money%50)%20)/10;
        of5 = (((money%50)%20)%10)/5;
        of2 = ((((money%50)%20)%10)%5)/2;
        of1 = ((((money%50)%20)%10)%5)%2;
        System.out.println(money + "€ se descomponen en " + of50 + " billete(s) de 50, " +
                of20 + " billete(s) de 20, " + of10 + " billete(s) de 10, " + of5 + " billete(s) de 5, "+
                of2 + " moneda(s) de 2 euros y " + of1 + " moneda(s) de 1 euro.");
    }
}
