/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextras_2;

import Entidad.Punto;

/**
 *
 * @author Yesica Rocio Gill
 */
public class POOExtras_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Punto miPunto= new Punto();
        miPunto.crearPuntos();
        System.out.println("la distancia entre los puntos 1 ( "+miPunto.getX1()+","+miPunto.getY1()+") y el Punto 2 ("+miPunto.getX2()+","+miPunto.getY2()+") es de "+miPunto.distancia());
        
    }
    
}
