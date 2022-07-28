/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;


public class Ejercicio5 {

   
    public static void main(String[] args) 
    {
        boolean opcionIncorrecta; 
        do
        {
        opcionIncorrecta = false; 
        Scanner scan = new Scanner(System.in); 
        System.out.println(" Calculadora  \n Elija una opcion \n 1. Area de un triangulo "
                + "\n 2. Area Cuadrado "
                + "\n 3. Area de un circulo \n 4. Area de un rectangulo \n 5. Salir. \n Opcion: "); 
        switch (scan.nextInt())
        {
            case 1: 
                    System.out.println(" \n Ingrese la altura del triangulo"); 
                    float h = scan.nextFloat(); 
                    System.out.println(" \n Ingrese la base del triangulo"); 
                    float b = scan.nextFloat();
                    System.out.println(" El resultado es: " + Ejercicio5.areaTriangulo(b, h) + " unidades cuadradas" );
                break; 
            case 2: 
                System.out.println(" \n Ingrese el valor de un lado del cuadrado"); 
                 float ladoCuadrado = scan.nextFloat();
                 System.out.println(" El resultado es: " + Ejercicio5.areaCuadrado(ladoCuadrado) + " unidades cuadradas" );
                break; 
            case 3: 
                System.out.println(" \n Ingrese el valor del radio del circulo"); 
                 float radio = scan.nextFloat();
                 System.out.println(" El resultado es: " + Ejercicio5.areaCirculo(radio) + " unidades cuadradas" );
                    break; 
            case 4: 
                 System.out.println(" \n Ingrese el largo del rectangulo"); 
                    float largo = scan.nextFloat();
                    System.out.println(" \n Ingrese el ancho del rectangulo"); 
                    float ancho = scan.nextFloat();
                    System.out.println(" El resultado es: " + Ejercicio5.areaTriangulo(largo, ancho) + " unidades cuadradas" );
                break; 
            case 5:
                System.exit(0); 
                break; 
            default: 
                System.out.println(" Opcion incorrecta ");
                opcionIncorrecta = true; 
                break; 
                
          
        }
          System.out.println("\n\t ¿Desea realizar otra operacion?   [s/n]"); 
            if (scan.next().equals("s"))
            {
                opcionIncorrecta = true; 
            }
             else
            {
                opcionIncorrecta = false; 
            }
        } while (opcionIncorrecta); 
    }
    public static float areaTriangulo (float base, float altura)
    {
        return (float)(base * altura * 0.5); 
    }
    public static float areaCuadrado(float lado)
      {
        return lado * lado; 
    }      
     public static float areaCirculo(float radio)
      {
        return (float)(Math.PI* (radio* radio)); 
      }     
      public static float areaRectangulo(float largo, float ancho)
      {
        return (float)(largo* ancho); 
    }     
    
}
