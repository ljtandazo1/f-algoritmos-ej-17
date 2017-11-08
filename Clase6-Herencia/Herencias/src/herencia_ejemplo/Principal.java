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
public class Principal {
    public static void main(String[] args) {
        Asignatura_Presencial ap=new Asignatura_Presencial("Programaciòn", "Comun", 100, 180);
        System.out.println(ap);
        
        Asignatura_Distancia ad=new Asignatura_Distancia("Literatura", "Troncal", 300, 6);
        System.out.println(ad);
        
    }
    
}
