/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;

import Interfaz.Adulto;

/**
 *
 * @author Juan Llado
 */
public class Perro extends Animal {
    
    private Adulto dueño;
    private String raza;

    public Perro(String raza, String nombre, int edad) {
        super(nombre, edad);
        this.raza = raza;
    }

    public Perro() {
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    @Override
    public void sonido() {
        System.out.println(this.getNombre() + " hace guau");
    }

   


    
    
}
