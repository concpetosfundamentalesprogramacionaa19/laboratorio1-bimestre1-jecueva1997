/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;
import java.util.Scanner;
// importa la libreria

/**
 *
 * @author reati
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // esta lista para uzar
        
        Scanner entrada = new Scanner(System.in);
        
        // declaro variables
        int horas;
        int costo_hora;
        double sueldo1,seguro;
       
        // presento el menu
        System.out.println("Ingrese las horas");
        horas = entrada.nextInt();
        
        System.out.println("Ingrese el costo por hora trabajada");         
        costo_hora = entrada.nextInt();
        
        // opercacion matematica
        
        sueldo1 = horas * costo_hora;
        seguro = sueldo1 * 0.10;
        sueldo1 = sueldo1- seguro;
        
        // mensaje final
        System.out.printf("El costo del seguro es: %.2f \nEl sueldo del trabajador es: %.2f\n",seguro,sueldo1);
        
        
                
        
       
       
        
    }
    
}
