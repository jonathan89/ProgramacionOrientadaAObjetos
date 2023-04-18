/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Yesica Rocio Gill
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Persona persona1 = new Persona();
       Persona persona2 = new Persona(33,"Jonathan","Apellido");        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese edad:");
        int edad1=leer.nextInt();
        persona2.setEdad(edad1);
        System.out.println(persona1.getEdad() +" " + persona2.getEdad());
    }
    
}
