/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio_4;

import Rectangulo.rectangulo;

/**
 *
 * @author Yesica Rocio Gill
 */
public class POOEjercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        rectangulo miRectangulo=new rectangulo();
        miRectangulo.crearRectangulo();
        System.out.println("La superficie del rectangulo es de: " + miRectangulo.superficie()+".\n"
                +"El perímetro del rectangulo es de: "+miRectangulo.perimetro()+".");
        miRectangulo.mostrarRectangulo();
    }
    
}
