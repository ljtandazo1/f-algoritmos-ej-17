/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

import herencia_ejemplo.Asignatura_Presencial;

/**
 *
 * @author reroes
 */
public class Estudiante extends Persona {
    private Asignatura_Presencial[] asignaturas; 

    public Estudiante(Asignatura_Presencial[] as, String n, String a, int e) {
        super(n, a, e);
        setAsignaturas(as);
    }
    public Asignatura_Presencial[] getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(Asignatura_Presencial[] as) {
        asignaturas = as;
    }
    
   public double valorMatricula() {
        double costo = 0;
        Asignatura_Presencial[] arregloAsignaturas = getAsignaturas();
        for (int i = 0; i < arregloAsignaturas.length; i++) {

            costo+=arregloAsignaturas[i].obtenerCosto();
        }
        return costo;
    }
   

    @Override
    public void setEdad(int e) {
        if (e < 18) {
            edad = 18;
        } else {
            edad = e;
        }
    }

    
    

   
    @Override
    public String toString() {

        return String.format("%s \n \tCosto Matriculas:%.2f", super.toString(),valorMatricula());
    }

    // @Override
    // public String toString(){
    //    return String.format("%s - %f", getApellido(), getMatricula());
    // }
}
