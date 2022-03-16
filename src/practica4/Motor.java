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
public class Motor {
    
    protected String fabricante;
    private int codigo;
    private String potencia;

    public Motor(String fabricante, int codigo, String potencia) {
        this.fabricante = fabricante;
        this.codigo = codigo;
        this.potencia = potencia;
    }

    public Motor() {
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Motor{" + "fabricante=" + fabricante + ", codigo=" + codigo + ", potencia=" + potencia + '}';
    }
    
}
