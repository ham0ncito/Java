/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in); 
      boolean continuar = false; 
      boolean ingresoDatosDimension = false; 
      boolean existeMatriz = false; 
       do
       {
           System.out.println("\n\n\t Menu \n1. Ingrese las Dimensiones de la Matriz.\n" +
            "2. Ingrese los datos de la Matriz\n" +
            "3. Imprimir Matriz.\n" +
            "4. Muestre el número Menor de la\n" +
            "matriz.\n" +
            "5. Salir \n\t Opcion: "); 
           switch(scan.nextInt())
           {
               case 1: 
                   System.out.println("\n 1. Matriz unidimensional \n" +
            "2. Matriz duodimensional \n" +
            "5. Salir \n\t Opcion: "); 
                   switch(scan.nextInt())
                   {
                       case 1: 
                           break; 
                       case 2: 
                           break; 
                       case 3: 
                           break; 
                   }
                   break; 
               case 2: 
                    if(existeMatriz)
                    {
                    
                    } else
                    {
                    System.out.println("No ha ingresado valores a la matriz");
                    continuar = true; 
                    }
                    
                   break; 
               case 3: 
                    if(existeMatriz && ingresoDatosDimension)
                    {
                    
                    } else
                    {
                    System.out.println("No ha ingresado valores a la matriz");
                    continuar = true; 
                    }
                   break; 
               case 4: 
                    if(existeMatriz && ingresoDatosDimension)
                    {
                    
                    } else
                    {
                    System.out.println("No ha ingresado valores a la matriz");
                    continuar = true; 
                    }
                   break; 
               case 5: 
                    System.exit(0); 
                   break; 
               default: 
                   System.out.println("Opcion invalida");
                   continuar = true; 
                   break; 
           }  
       }while(continuar);
    }
    
}
