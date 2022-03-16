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
public class Juguete {
    
    private String nombreJuguete;
    private int precio;
    private int edadRecomendada;

    public Juguete(String nombreJuguete, int precio, int edadRecomendada) {
        this.nombreJuguete = nombreJuguete;
        this.precio = precio;
        this.edadRecomendada = edadRecomendada;
    }

    public Juguete() {
    }

    public String getNombreJuguete() {
        return nombreJuguete;
    }

    public void setNombreJuguete(String nombreJuguete) {
        this.nombreJuguete = nombreJuguete;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getEdadRecomendada() {
        return edadRecomendada;
    }

    public void setEdadRecomendada(int edadRecomendada) {
        this.edadRecomendada = edadRecomendada;
    }

    @Override
    public String toString() {
        return "Juguete{" + "nombreJuguete=" + nombreJuguete + ", precio=" + precio + ", edadRecomendada=" + edadRecomendada + '}';
    }
    
    
    
    
    
}
