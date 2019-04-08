/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.prueva;

import ec.edu.ups.clases.Ave;
import ec.edu.ups.clases.Perro;
import ec.edu.ups.clases.Pez;

/**
 *
 * @author Edison
 */
public class Main {
    
    public static void main(String[]args){
        
        Perro lukas = new Perro("Lukas", 7, 15, "Macho");
        Pez payaso = new Pez("Payaso", 1, 1, "Macho");
        Ave alita = new Ave("Alita", 2, 3, "Hembra");
        
        System.out.println(lukas+"\n");
        System.out.println(payaso+"\n");
        System.out.println(alita+"\n");
        
        
    }
    
}
