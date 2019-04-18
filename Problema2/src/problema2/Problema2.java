/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;
// se importa una libreria
import java.util.Scanner;
/**
 *
 * @author reati
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // la libreria esta importada y esta lista para ser utilizada
        Scanner entrada = new Scanner(System.in);
        
        // declaracion de variables
        String c, d , f;
        
        // presentacin del menu
        System.out.println("Ingrese el valor de x");
        c = entrada.nextLine();
        
        System.out.println("Ingrese el valor de y");
        d = entrada.nextLine();
        
        System.out.println("Ingrese el valor de z");
        f = entrada.nextLine();
        
        // se cambia las variables
        double x = Double.parseDouble(c);
        double y = Double.parseDouble(d);
        double z = Double.parseDouble(f);
        
        // operacion matematica
        double m = (x+(y/z)/x-(y/z));
        
        // primer mensaje
        System.out.printf("El valor de m, en base a las variables: \n"
                + "x = %s\n\t"+ "y = %s\n\t\t" + "z = %s\n", x, y, z);
        
        // segundo mensaje con el resultado de la operacion
        System.out.printf("da como resultado: \n" + "m = %s\n\t", m);
                
        
        
        
        
        
        
        
        
        
    }
    
}
