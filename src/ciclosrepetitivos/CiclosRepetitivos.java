
package ciclosrepetitivos;
import java.util.Scanner;
/**
 *
 * @author ASUS GAMER
 */
public class CiclosRepetitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        //Declaracion de variables 
        int i, n, suma;
        i = 1; n = 0; suma = 0;
        
        System.out.println("Ingrese el limite de números a presentar");
        n = leer.nextInt();
        
        //Iniciamos el ciclo repetitivo while
        
        while (i <= n){
            System.out.println(i);
            suma = suma + i;
            i = i + 1;
        }
        System.out.println("La suma de los numeros es: " +suma);
        
    }
    
}
