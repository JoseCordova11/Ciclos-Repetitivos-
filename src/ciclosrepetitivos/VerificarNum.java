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
public class VerificarNum {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Declaracion e inicializacion de variables
        
        int cont, limite, num, sumPar, sumImpar, sumNeg, sumPos;
        cont = 1; limite = 1; num = 0; sumPar = 0; sumImpar = 0; sumNeg = 0; sumPos = 0;
        
        System.out.println("Ingrese el limite de numero a verificar");
        limite = leer.nextInt();
        
        //Ciclo repetitivo 
        
        while(cont <= limite){
            System.out.println("Ingrese el numero a verificar");
            num = leer.nextInt();
            
            if(num % 2 == 0){   //Verifica si un numero es par o impar   
                sumPar = sumPar + num;       //suma los numeros pares
            }
            else{               
                sumImpar = sumImpar + num;   //suma los numeros impares
            }
            
            if (num > 0){       //Verificar si es positivo o negativo 
                sumPos = sumPos + num;      //suma los numeros positivos 
            }
            else {               
                sumNeg = sumNeg + num;      //suma los numeros negativos 
            }
            
            cont = cont + 1;
            
            System.out.println("La suma de los pares es: "+sumPar);
            System.out.println("La suma de los impares es: "+sumImpar);
            System.out.println("La suma de los positivos es: "+sumPos);
            System.out.println("La suma de los negativos es: "+sumNeg);
        }
        
        System.out.println("Sumas totales \n");
        System.out.println("La suma de los pares es: "+sumPar);
        System.out.println("La suma de los impares es: "+sumImpar);
        System.out.println("La suma de los positivos es: "+sumPos);
        System.out.println("La suma de los negativos es: "+sumNeg);
      
        
    }
}
