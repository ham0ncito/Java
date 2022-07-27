

package ejercicio;

import java.util.Scanner; 
public class Ejercicio {

   
    public static void main(String[] args) {
        int filas = 3, columnas = 4; 
        int valores [][] = new int[filas][columnas]; 
        Scanner scan = new Scanner(System.in); 
        for (int posiciony = 0; posiciony < filas; posiciony++ )
        {
            for (int posicionx = 0 ; posicionx < columnas; posicionx++)
            {
                System.out.println(" Posicion [" + (posiciony+1) +"} [" + (posicionx+1) + "] del arreglo. Ingrese un valor  = "); 
                valores[posiciony][posicionx] = scan.nextInt(); 
            }
        }
        System.out.println("A = " ); 
        for (int fila = 0; fila < filas; fila++ )
        {
            System.out.print("\t |"); 
            for (int columna = 0 ; columna < columnas; columna++)
            {
                System.out.print("\t " + valores[fila][columna]); 
            }
            System.out.print("\t | \n"); 
        }
    }
    
}
