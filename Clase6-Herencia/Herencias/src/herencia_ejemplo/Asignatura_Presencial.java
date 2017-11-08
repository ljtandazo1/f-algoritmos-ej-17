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
public class Asignatura_Presencial extends Asignatura{
    private int numero_horas;

    public Asignatura_Presencial(String n, String t, double c,int nh) {
        super(n, t, c);
         establecerNumero_horas(nh);
    }

    public int obtenerNumero_horas() {
        return numero_horas;
    }

    public void establecerNumero_horas(int nh) {
        numero_horas = nh;
    }
    
    @Override
    public String toString() {

        return String.format("Asignatura Presencial : %s\n%s\tNumero de Horas: %d\n", obtenerNombre(),super.toString(),obtenerNumero_horas());
    }
    

}
