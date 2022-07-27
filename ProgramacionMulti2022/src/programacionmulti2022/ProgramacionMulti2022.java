/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionmulti2022;

/**
 *
 * @author HP
 */
public class ProgramacionMulti2022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.print("**********Menu********** \n 1. Ingresar datos \n 2. Mostrar Datos \n 3. Salir \n\n "
                + "************************ \n");
        int numero = 20; 
        System.out.println("El numero es: "+ numero); 
        String cr7 = "Siuu"; 
        double pi = 3.14; 
        boolean var = false; 
        char x = 'x';
        System.out.println(cr7+ " " + pi+ " " + var + " " + x); 
    
        String nombres [] = new String[12]; 
        nombres[0] = "Donnarumma"; 
        nombres[1] = "Navas"; 
        nombres[2] = "Rico"; 
        nombres[3] = "Letellier"; 
        nombres[4]= "Innocent"; 
        nombres[5] = "Franchi"; 
        nombres[6] = "Lavalée"; 
        nombres[7] = "Randriamamy"; 
        nombres[8] = "Kimpembe"; 
        nombres[9] = "Pemebélé"; 
        nombres[10] = "Baldé"; 
        nombres[11]= "Mbappé"; 
        
        for(int i = 0; i <= 3;i = i +1 )
        {
            int a = (int)(Math.random()* (11 +1)); 
            System.out.println(nombres[a]);
        }
        
     }
