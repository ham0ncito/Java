/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        boolean datosIngresados = false; 
        boolean seguir = false; 
        Persona per = new Persona(); 
        per.nombrePersona = "Juan";  
        do
        {
            System.out.println(" \n\t Menu \n "
                    + "Menú\n" +
            "1. Ingrese Datos generales.\n" +
            "2. Muestre los Datos generales.\n" +
            "3. Salir \n Ingres su opcion");
            int opc = scan.nextInt(); 
            switch(opc)
            {
                case 1: 
                   System.out.print("\n Introduzca su informacion "); 
                   System.out.print("\n Ingrese su edad "); 
                    per.edad = scan.nextInt();
                    System.out.print("Ingrese su numero de identidad   "); 
                    per.numeroIdentidad = scan.next();
                     System.out.print("Ingrese su nombre "); 
                    per.nombrePersona = scan.next();
                    scan.nextLine();
                    System.out.print("Ingrese su direccion de residencia "); 
                    per.direccionPersona = scan.nextLine();
                    
                    datosIngresados = true; 
                    break; 
                case 2: 
                if(datosIngresados)
                {
                per.mostrarDatos();
                }
                else
                {
                    System.out.println("\n\t No existen valores ingresados"); 
                    
                }
                seguir = true; 
                    break; 
                case 3: 
                    System.exit(0); 
                    break; 
                default : 
                    System.out.println(" \n\t Opcion incorrecta"); 
                    seguir = true; 
                    break; 
            }
            
            System.out.println("\n\t ¿Desea realizar otra operacion?   [s/n]"); 
            if (scan.next().equals("s"))
            {
                seguir = true; 
            }
            else
            {
                seguir = false; 
            }
        } while (seguir); 
    }
    
}
