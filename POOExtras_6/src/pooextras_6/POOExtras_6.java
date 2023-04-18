/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextras_6;

import entidad.Rectangulo;
import java.text.ChoiceFormat;
import java.util.Scanner;

/**
 *
 * @author Yesica Rocio Gill
 */
public class POOExtras_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo rectangulo=new Rectangulo();
        Rectangulo rectangulo1=new Rectangulo(4,6);
        Scanner var=new Scanner (System.in);
        System.out.println("Ingrese el valor del lado 1:");
        double ladoa=var.nextDouble();
        rectangulo.setLado1(ladoa);
        System.out.println("Ingrese el valor del lado 2:");
        double ladob=var.nextDouble();
        rectangulo.setLado2(ladob);
        System.out.println(rectangulo.calcular_area());
        System.out.println(rectangulo1.calcular_area());
    }
    
}
