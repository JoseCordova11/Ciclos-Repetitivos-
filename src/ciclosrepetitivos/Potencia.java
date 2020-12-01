/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclosrepetitivos;
import java.util.Scanner;
/**
 *
 * @author ASUS GAMER
 */
public class Potencia {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Declarar e inicializar las variables
        
        int base, pot, cont, resul;
        base = 0; pot = 0; cont = 1; resul = 1;
        
        System.out.println("Ingrese la base de la potencia: ");
        base = leer.nextInt();
        
        System.out.println("Ingresar la potencia: ");
        pot = leer.nextInt();
        
        //Ciclo repetitivo
        
        while (cont <= pot){
            resul = resul * base;
            cont = cont + 1;
        }
        
        System.out.println("La potencia de: "+base + " elevado a: "+pot + " es: "+resul);
        
    }
}
