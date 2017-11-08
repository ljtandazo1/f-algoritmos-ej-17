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
public class Asignatura_Distancia extends Asignatura {
    
    private int numero_creditos;
    
    public Asignatura_Distancia(String n, String t, double c, int nc) {
        super(n, t, c);
        establecerNumero_creditos(nc);
    }
    
    public int obtenerNumero_creditos() {
        return numero_creditos;
    }
    
    public void establecerNumero_creditos(int nc) {
        numero_creditos = nc;
    }
    
    @Override
    public String toString() {

        return String.format("Asignatura Distancia : %s\n%s\tNumero de Creditos: %d\n", obtenerNombre(),super.toString(),obtenerNumero_creditos());
    }
}
