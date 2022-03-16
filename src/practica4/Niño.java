/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;

/**
 *
 * @author Juan Llado
 */
public class Niño extends Persona{
    
    private Juguete juguete;
    private String colegio;

    public Niño(String colegio, String nombre, String DNI, int edad) {
        super(nombre, DNI, edad);
        this.colegio = colegio;
    }
    
    public void comprarJuguete(Juguete juguete){
        this.juguete = juguete;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    @Override
    public String toString() {
        return "Ni\u00f1o{" + "colegio=" + colegio + '}';
    }
    
    
    
}
