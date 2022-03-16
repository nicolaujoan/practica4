/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import practica4.Barco;
import practica4.Gato;
import practica4.Perro;
import practica4.Persona;

/**
 *
 * @author Juan Llado
 */
public class Adulto extends Persona{
    private String NSS;
    private String direccion;
    private Perro perro;
    private Gato gato;
    private Barco embarcacion;

    public Adulto(String NSS, String direccion) {
        this.NSS = NSS;
        this.direccion = direccion;
    }

    public String getNSS() {
        return NSS;
    }

    public void setNSS(String NSS) {
        
        
        System.out.println("");    
        
        
        
        this.NSS = NSS;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Adulto{" + "NSS=" + NSS + ", direccion=" + direccion + '}';
    }
    
    
    
}
