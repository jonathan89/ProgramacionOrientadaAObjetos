/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextras_1;

import Cancion.cancion;
import java.util.Scanner;

/**
 *
 * @author Yesica Rocio Gill
 */
public class POOExtras_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cancion miCancion = new cancion();
        Scanner var =new Scanner(System.in);
        String Titulo, Autor;
        System.out.println("Ingrese el titulo de la canción:");
        Titulo=var.nextLine();
        miCancion.setTitulo(Titulo);
        System.out.println("Ingrese el autor de la canción");
        Autor=var.nextLine();
        miCancion.setAutor(Autor);
        System.out.println("Nombre de la canción: "+miCancion.getTitulo()+"\n"
        +"Autor de la canción: "+miCancion.getAutor()+".");
        
    }
    
}
