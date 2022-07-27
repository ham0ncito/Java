/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerci26_7;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Ejerci26_7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        int valores[] = new int[3]; 
        for (int a = 0; a <3; a++)
        {
        System.out.println(" Ingrese el valor de la tabla de multiplicar   "); 
        valores[a] = scan.nextInt();      
        }
        int b = 1; 
        System.out.println("\n\t Tabla de multiplicar del " +  valores[0]); 
        while (b<=12)
        {
            System.out.print( "\t" + valores[0] +  " * " + b + " = " + (valores[0] * b) + "\n");
            b++;
        }
        
        System.out.println("\n\t Tabla de multiplicar del " +  valores[1]); 
        int c = 1; 
        do 
        {
            System.out.print( "\t" + valores[1] +  " * " + c + " = " + (valores[1] * c)+ "\n");
            c++;
        } while (c<12); 
        System.out.println("\n\t Tabla de multiplicar del " +  valores[2] +"\n"); 
         for (int d = 1; d <=12; d++)
        {
         System.out.print( "\t" + valores[2] +  " * " + d + " = " + (valores[2] * d)+ "\n"); 
        }

    }
    
}
