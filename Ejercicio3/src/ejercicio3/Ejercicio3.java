/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in); 
       int datos[] = new int[4]; 
       boolean continuar = true; 
       while (continuar)
       {
           System.out.println("\n\t Ingrese un valor  : ");
           datos[0] = scan.nextInt(); 
           if (datos[0] != 0)
           {
               if(datos[0]>datos[1])
               {
                   datos[1] = datos[0]; 
               }
               if (datos[0] < datos[2])
               {
                   datos[2] = datos[0]; 
               }
               datos[3] += datos[0]; 
           }
           else 
           {
               continuar = false; 
               System.out.println("\n\t El mayor valor introducido es " + datos[1]);
               System.out.println("\n\t El menor valor introducido fue " + datos[2]);
               System.out.println("\n\t El total de valores fue " + datos[3]);
           }
           
       }
       
       
    }
    
}
