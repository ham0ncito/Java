/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;



 public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in); 
        String valores[] = {"Lunes", "Martes","Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"}; 
        int resultado= 0; 
        do
        {
         System.out.println("\n\t Seleccione un dia de la semana \n" );    
        for (int i = 0; i < valores.length; i++ )
        {
            System.out.println("\t " + (i+1) + ". "+  valores[i] +"\n" ); 
        }
        System.out.println(" Opcion = ");
        resultado = scan.nextInt();    
        } while (resultado <1 || resultado >7); 
        Ejercicio2.diaDeLaSemana(resultado);
    }
   
    public static void diaDeLaSemana(int a)
    {
        if(a > -1 && a < 6)
        {
           System.out.println(" \n El dia seleccionado es un dia laboral \n");
        }
        else
        {
             System.out.println(" \n El dia seleccionado NO es un dia laboral \n");
        }
    }
    
}
