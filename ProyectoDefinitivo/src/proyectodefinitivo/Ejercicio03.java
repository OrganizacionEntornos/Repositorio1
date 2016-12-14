package proyectodefinitivo;
import java.util.Scanner;
/**
 *
 * @author JCRomero
 */
public class Ejercicio03
{
    public static void calculateTime(String[] args)
    {
        int time;
        int days, hours, minutes, seconds; 
        
        Scanner userInput = new Scanner(System.in);
        System.out.println("Por favor, introduzca un número de segundos: ");
        time = userInput.nextInt();
        
        days = time / (60*60*24);
        hours = (time % (60*60*24))/(60*60);
        minutes = ((time % (60*60*24))%(60*60))/60;
        seconds = ((time % (60*60*24))%(60*60))%60;
        
        System.out.println (time + " segundos hacen un total de: " + days + " días, "+ 
                hours + " horas, " + minutes + " minutos y " + seconds + " segundos.");
    }
}
