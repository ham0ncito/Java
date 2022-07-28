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
      boolean ingresoDatos = false; 
      boolean existeMatriz = false;
      int dimenx = 0, dimeny = 0; 
      int menorX=0, menorY=0 ; 
      int matrizU[] = null; 
      int matrizB[][] = null; 
      boolean esDoble = false; 
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
                           System.out.println(" Ingrese el largo de la matriz"); 
                           dimenx = scan.nextInt(); 
                           existeMatriz = true; 
                           break; 
                         
                       case 2: 
                            System.out.println(" Ingrese el largo de la matriz"); 
                           dimenx = scan.nextInt(); 
                           System.out.println(" Ingrese el ancho de la matriz"); 
                           dimeny = scan.nextInt(); 
                           existeMatriz = true; 
                           esDoble = true; 
                           break; 
                       case 3: 
                           
                           break; 
                       default: System.out.println(" Opcion inexisten\n"); 
                           break; 
                   }
                   break; 
               case 2: 
                    if(existeMatriz)
                    {
                          if(esDoble)
                          {    matrizB = new int[dimenx][dimeny]; 
                              for (int x = 0; x < dimenx; x++)
                              {
                                  
                                  for(int y = 0; y <dimeny; y++)
                                  {
                                       System.out.println("\n Ingrese el valor de la matriz en "+ 
                                               (x+1) +  " y " + (y+1)); 
                                       matrizB[x][y] = scan.nextInt(); 
                                     
                                  }
                              }
                              
                          }
                          else
                          {
                              matrizU = new int[dimenx]; 
                          for (int x = 0; x < dimenx; x++)
                            {
                                  System.out.println("\n Ingrese los valores de la matriz en "+  (x+1)); 
                                  matrizU[x] = scan.nextInt(); 
                             }
                          }
                          ingresoDatos = true; 
                    } else
                    {
                    System.out.println("No ha ingresado valores a la matriz");
                    continuar = true; 
                    }
                    
                   break; 
               case 3: 
                    if(existeMatriz && ingresoDatos)
                    {
                     if(esDoble)
                          {
                          for (int x = 0; x < dimenx; x++)
                              {
                                  System.out.print("{");
                                  for(int y = 0; y <dimeny; y++)
                                  {
                                       System.out.println(" " + matrizB[x][y] + " "); 
                                      
                                  }
                                  System.out.print("} \n");
                              }
                          }
                          else
                          {
                              System.out.print("{");
                                  for(int x = 0; x <dimeny; x++)
                                  {
                                       System.out.println(" " + matrizU[x] + " "); 
                                      
                                  }
                                  System.out.print("} \n");
                          }
                    } else
                    {
                    System.out.println("No ha ingresado valores a la matriz");
                    continuar = true; 
                    }
                   break; 
               case 4: 
                    if(existeMatriz && ingresoDatos)
                    {
                         if(esDoble)
                          {
                              
                          }
                          else
                          {
                          
                          }
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
           System.out.println("\n\t ¿Desea realizar otra operacion?   [s/n]"); 
            if (scan.next().equals("s"))
            {
                continuar = true; 
            }
             else
            {
                continuar = false; 
            }
       }while(continuar);
    }
    
}
