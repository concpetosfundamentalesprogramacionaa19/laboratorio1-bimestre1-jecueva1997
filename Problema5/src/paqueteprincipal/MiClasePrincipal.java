/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// importando las clases
package paqueteprincipal;
import paquete1.*;
import paquete2.*;
import paquete3.*;
/**
 *
 * @author reati
 */
public class MiClasePrincipal {
    public static void main(String[] args){
    
    
    // opercion de la edad
    String m = MiClase1.edad >= 18 ? "y Usted es mayor de edad" : 
                "yUsted es menor de edad ";
    
    // presentacion de datos
    System.out.printf("Nombre: \n\t%s \n" + "Apellido: \n\t%s " + "\nEdad:"
            + " \n\t %d %s", MiClase2.nombre, MiClase3.apellido, 
            MiClase1.edad, m );
    }
    
    
 
   
    
    
    
   
                      
    
    
}
