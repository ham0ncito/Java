/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner; 

public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*int numero1 = 2;
        int numero2 = 4;
        int resultado = numero1 + numero2; 
        System.out.print(resultado); */

        Scanner scan = new Scanner(System.in); 
        /*double valor[] = new double[7];
        System.out.print("Ingrese un valor "); 
        valor[0] = scan.nextInt(); 
        System.out.print("Ingrese otro valor "); 
        valor[1] = scan.nextInt();      
        valor[2] = valor[0] +  valor[1];
        valor[3] = valor[0] -  valor[1];
        valor[4] = valor[0] *  valor[1];
        valor[5] = valor[0] /  valor[1];
        System.out.println(" Los resultados de las operaciones de los valores "+  valor[0] +  " y " + valor[1]);
        System.out.println(" Suma: " + valor[2]);
        System.out.println(" Resta: " + valor[3]);
        System.out.println(" Multiplicacion " + valor[4]);
        System.out.println(" Division: " + valor[5]);
        */
        /*String datos[] = new String [2]; 
        String usuario1; 
                String contraseña1;
        String usuario = "administrador";
        String contrasena = "12345";
        System.out.print(" Ingrese su usuario "); 
        usuario1= scan.next();
        System.out.print(" Ingrese su contraseña "); 
        contraseña1 = scan.next();
        if (usuario1.equals( usuario) && contraseña1.equals(contrasena))
        {
            System.out.println(" Bienvenido administrador"); 
        }
        else
        {
             System.out.println(" Lo sentimos usuario incorrecto"); 
        }*/
        /*int numerosGanadores[] = new int[4]; 
        numerosGanadores[0] = 25; 
        numerosGanadores[1] = 45; 
        numerosGanadores[2] = 60; 
        int edad[] = new int [2]; 
        edad[0] = 21; 
        System.out.print(" Lotera \n Ingrese su edad para ganar "); 
        edad[1] = scan.nextInt();
        System.out.print(" Ingrese su nombero de boleto para ganar "); 
        numerosGanadores[3] = scan.nextInt();
        
        if (edad[1]>= edad[0]&& (numerosGanadores[3] == numerosGanadores[1] || 
                numerosGanadores[3] == numerosGanadores[2] || numerosGanadores[3] == numerosGanadores[0] ) 
                )
        {
            System.out.print(" Es ganador"); 
        }   
        else if (edad[1] < edad[0]&& (numerosGanadores[3] == numerosGanadores[1] || 
                numerosGanadores[3] == numerosGanadores[2] || numerosGanadores[3] == numerosGanadores[0] ) 
                ) 
        {
            System.out.print(" Tiene el boleto ganador pero no la edad suficiente\n"); 
        }
        else
        {
             System.out.print(" No tiene los requisitos \n"); 
        }
        */
        String nombre = "Usuario"; 
      String id = "0000000"; 
      String campus = "SCJ";
      boolean datosIngresados = false; 
      
        while (true)
                {
         System.out.println("\n\n\t Menu \n\t 1. Ingrese sus datos personales \n\t 2. Mostrar datos \n\t 3 Salir \n\t Opcion :  ");
      int opcion = 0 ; 
      
        opcion = scan.nextInt(); 
        switch (opcion)
        {
            case 1: 
               System.out.println(" \t Ingrese su nombre");
               nombre =  scan.next(); 
               System.out.println(" \t Ingrese su numero de identidad");
               id =  scan.next(); 
               System.out.println(" \t Ingrese su campus");
               campus =  scan.next(); 
               datosIngresados = true; 
               break; 
            case 2: 
                if (datosIngresados)
                {
                    System.out.println(" Su nombre es " + nombre); 
                    System.out.println(" Su Identidad es " + id);
                    System.out.println(" Su campus es " + campus); 
                }
                else
                {
                    System.out.println(" No ha ingresados datos "); 
                }
                break; 
            case 3: 
                System.out.println(" ari ari ari arrivederci "); 
               System.exit(0); 
               break; 
            default: 
                System.out.println(" Opcion erronea ");
                break; 
        }
        System.out.print("\033[H\033[2J");
      System.out.flush();
                }
        
    }
}


