/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;

import Interfaz.Adulto;
import Interfaz.NewInterface;
import java.util.Date;

/**
 *
 * @author Juan Llado
 */
public class Barco implements NewInterface{
    
    private Adulto dueño;
    private String nombreBarco;
    private Date fechaConstruccion;
    private int numCamarotes;
    private Motor motor;

    /**
     * 
     * @param nombreBarco
     * @param fechaConstruccion
     * @param numCamarotes
     * @param fabricante
     * @param codigo
     * @param potencia 
     */
    public Barco(String nombreBarco, Date fechaConstruccion, int numCamarotes, String fabricante, int codigo, String potencia) {
        this.nombreBarco = nombreBarco;
        this.fechaConstruccion = fechaConstruccion;
        this.numCamarotes = numCamarotes;
        this.motor = new Motor(fabricante, codigo, potencia); 
        
    }

   
    
    public Barco() {
    }

    /**
     * 
     * 
     * @return dueño
     */
    public Adulto getDueño() {
        return dueño;        
    }

    /**
     * 
     * 
     * @param dueño 
     */
    public void setDueño(Adulto dueño) {
        this.dueño = dueño;
    }

    public String getNombreBarco() {
        return nombreBarco;
    }

    public void setNombreBarco(String nombreBarco) {
        this.nombreBarco = nombreBarco;
    }

    public Date getFechaConstruccion() {
        return fechaConstruccion;
    }

    public void setFechaConstruccion(Date fechaConstruccion) {
        this.fechaConstruccion = fechaConstruccion;
    }

    public int getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Barco{" + "due\u00f1o=" + dueño + ", nombreBarco=" + nombreBarco + ", fechaConstruccion=" + fechaConstruccion + ", numCamarotes=" + numCamarotes + ", motor=" + motor + '}';
    }

    
    @Override
    public void sonido() {
        System.out.println(this.nombreBarco + " hace BBBBRRRR");
    }
    
    
    
    
}
