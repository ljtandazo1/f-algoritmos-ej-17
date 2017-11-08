/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_ejemplo;

/**
 *
 * @author LISBER
 */
public class Asignatura {
    private String nombre;
    private String tipo;
    protected double costo;

    public Asignatura(String n, String t, double c) {
        establecer_Nombre(n);
        establecerTipo(t);
        establecerCosto(c);
        
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecer_Nombre(String n) {
        nombre = n;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public void establecerTipo(String t) {
        tipo = t;
    }

    public double obtenerCosto() {
        return costo;
    }

    public void establecerCosto(double c) {
        costo = c;
    }
    
     @Override
    public String toString() {

        return String.format("\tTipo : %s\n"
                + "\tCosto : $%.2f\n",obtenerTipo(),obtenerCosto()
        );
    }
    
    
    
}
