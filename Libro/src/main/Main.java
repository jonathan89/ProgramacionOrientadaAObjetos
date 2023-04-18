/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
import libro.Libro;

/**
 *
 * @author Yesica Rocio Gill
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro1=new Libro();
        Libro libro2=new Libro(15500,"The Whale","Brendan", 500);
        Scanner leer=new Scanner (System.in);
        System.out.println("Ingrese el Titulo del libro:");
        String nomlib=leer.nextLine();        
        System.out.println("Ingrese el ISBN del libro:");
        int isbn=leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese el autor del libro:");
        String autor=leer.nextLine();
        System.out.println("");
        System.out.println("Ingrese la cantidad de páginas:");
        int pag=leer.nextInt();
        System.out.println("");
        libro1.setAutor(autor);
        libro1.setISBN(isbn);
        libro1.setTitulo(nomlib);
        libro1.setPaginas(pag);
        System.out.println(libro1.getISBN()+"\n"
        +" "+libro1.getTitulo()+"\n"
        + " "+libro1.getAutor()+"\n"
                + " "+libro1.getPaginas());
        System.out.println("********************");
        System.out.println(libro2.getISBN()+"\n"
        + " "+libro2.getTitulo()+"\n"
        + " "+ libro2.getAutor()+"\n"
        + " "+ libro2.getPaginas());
    }
    
}
