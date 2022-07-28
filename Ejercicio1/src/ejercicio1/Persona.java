/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author HP
 */
public class Persona {
    String nombrePersona;
    String numeroIdentidad; 
    String direccionPersona; 
    int edad; 
    
    public void mostrarDatos()
    {
        System.out.println(" Hola, mi nombre es " +  nombrePersona); 
        System.out.println(" Mi numero de identidad es " +  numeroIdentidad);
        System.out.println(" Mi direccion es " +  direccionPersona); 
        System.out.println(" Mi edad es:  " +  edad); 
    }
}
