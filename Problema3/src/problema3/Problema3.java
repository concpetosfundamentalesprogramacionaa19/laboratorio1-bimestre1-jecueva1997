/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;
// imprto la libreria
import java.util.Scanner;
/**
 *
 * @author reati
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // se puede utilizarla libreria
        Scanner entrada = new Scanner(System.in);
        // declarando variables
        String a, b, c;
       
        // ingresando menu de opciones
        System.out.println("Ingrese la primera nota");
        a  = entrada.nextLine();
        
        System.out.println("Ingrese la segunda nota");
        b = entrada.nextLine();
        
        System.out.println("Ingrese la tercera nota");
        c = entrada.nextLine();
        
        //cambiand de variable
        double nota1 = Double.parseDouble(a);
        double nota2 = Double.parseDouble(b);
        double nota3 = Double.parseDouble(c);
        
        // primera operacion matematica
        double resultado = (nota1 + nota2 + nota3);
        
        // segunda operacion 
        double promedio = (resultado / 3);
        
        // comparando el promedio
        String m = promedio>=14? " a sido aprobado" : 
                " a sido reprobado ";
        
        // resultado final
        System.out.printf("El estudiante: %s\n", m);
        
        
        
       
    }
    
}
