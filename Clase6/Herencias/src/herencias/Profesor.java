/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

/**
 *
 * @author LISBER
 */
public class Profesor extends Persona {

    private double sueldo;

    public Profesor() {
        super("Angel", "Alvarez", 36);
    }

    public Profesor(double s) {
        super("Rene", "Elizalde", 34);
        establecerSueldo(s);
    }

    public Profesor(String n, String a, int e, double s) {
        super(n, a, e);
        establecerSueldo(s);
    }
    
     @Override
    public void setEdad(int e) {
        if (e < 30) {
            edad = 30;
        } else {
            edad = e;
        }
    }
    public double obtenerSueldo() {
        return sueldo;
    }

    public void establecerSueldo(double s) {
        sueldo = s;
    }

}
