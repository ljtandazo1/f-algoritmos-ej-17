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
public class Herencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Estudiante e = new Estudiante("René", "Elizalde", 33, 100.2);
        System.out.println(e);

        Profesor p = new Profesor(1001);
        System.out.println(p.getNombre());

        Profesor p1 = new Profesor();
        System.out.println(p1.getNombre());

        Profesor p2 = new Profesor("Luis", "Alvarez", 20, 3000.2);
        System.out.println(p2.getNombre());
        Estudiante e1 = new Estudiante("Andres", "Alverca", 17, 5);
        System.out.println("Edad: " + e1.getEdad());
        Profesor p3 = new Profesor("Luis", "Alvarez", 32, 3000.2);
        System.out.println("Edad: " + p3.getEdad());
         */
        
        Asignatura_Presencial ap = new Asignatura_Presencial("Programaciòn", "Comun", 100, 180);
        System.out.println(ap);

        Asignatura_Presencial ap2 = new Asignatura_Presencial("Literatura", "Troncal", 300, 6);
        System.out.println(ap2);

        Asignatura_Presencial[] asignaturas = new Asignatura_Presencial[2];
        asignaturas[0] = ap;
        asignaturas[1] = ap2;
        Estudiante e1 = new Estudiante(asignaturas, "Rene", "Elizalde", 34);
        System.out.println(e1);
        
    }

}
