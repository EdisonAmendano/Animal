/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import ec.edu.ups.interfaces.Acciones;

/**
 *
 * @author Edison
 */
public class Perro extends Animal implements Acciones{

    public Perro(String nombre, int edad, double peso, String sexo) {
        super(nombre, edad, peso, sexo);
    }

    @Override
    public void comer() {
        System.out.println("El perro " + this.getNombre()+" esta comiendo");
    }

    @Override
    public void dormir() {
        System.out.println("El perro " + this.getNombre()+" esta durmiendo");
    }

    @Override
    public void moverese() {
        System.out.println("El perro "+ this.getNombre()+" se esta moviendo");
    }

    @Override
    public void jugar() {
        System.out.println("El perro "+ this.getNombre()+" esta jugando");
    }

    @Override
    public void reproducirese() {
        System.out.println("El perro "+ this.getNombre()+" se esta reproducionedo");
    }
    
    @Override
    public String toString() {
        return "Perro:" + "\n\tNombre: " + this.getNombre() + "\n\tEdad: " + this.getEdad()+ "\n\tPeso: " + this.getPeso()+"kg"
                + "\n\tSexo: " + this.getSexo();
    }
  
}
