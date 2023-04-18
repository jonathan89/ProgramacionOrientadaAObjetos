/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Yesica Rocio Gill
 */
public class Juego {
     private int numero, intentos,num,gan1,gan2;
     String jugador1, jugador2;
     boolean verificacion=false;

    public Juego() {
    }

    public Juego(int numero, int intentos, int num, int gan1, int gan2, String jugador1, String jugador2) {
        this.numero = numero;
        this.intentos = intentos;
        this.num = num;
        this.gan1 = gan1;
        this.gan2 = gan2;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getGan1() {
        return gan1;
    }

    public void setGan1(int gan1) {
        this.gan1 = gan1;
    }

    public int getGan2() {
        return gan2;
    }

    public void setGan2(int gan2) {
        this.gan2 = gan2;
    }

    public String getJugador1() {
        return jugador1;
    }

    public void setJugador1(String jugador1) {
        this.jugador1 = jugador1;
    }

    public String getJugador2() {
        return jugador2;
    }

    public void setJugador2(String jugador2) {
        this.jugador2 = jugador2;
    }

    public boolean isVerificacion() {
        return verificacion;
    }

    public void setVerificacion(boolean verificacion) {
        this.verificacion = verificacion;
    }
     public void adivinaElNumero(){
         gan1=0;
         gan2=0;
         String seleccion="S";
         Scanner var=new Scanner(System.in);
                      
         System.out.println("Ingrese el nombre de los jugadores 1 y 2:");
         jugador1=var.next();
         jugador2=var.next();
         do {
         System.out.println(jugador1+" ingrese el número a buscar:");
         numero=var.nextInt();
         System.out.println(jugador1+" ingrese la cantidad de intentos que tendra "+jugador2+".");
         intentos=var.nextInt();
         while (verificacion==false) {
             System.out.println(jugador2+" tiene "+intentos+" intentos. Ingrese un número:");
             num=var.nextInt();
             intentos--;
             if (num>numero){
                System.out.println("Pruebe con un numero mas chico");
            } else if (num<numero) {
                System.out.println("Pruebe con un numero mas grande");
            }
            if (num==numero){
                System.out.println("Usted ha acertado!!");
                gan2++;
                verificacion=true;
                break;
            }
            if (intentos==0){
                System.out.println("usted ha perdido :C");
                gan1++;
                break;
            }
             
         }
         System.out.println("¿Desea seguir jugando? S/N.");
             seleccion=var.next();
         } while (seleccion.equalsIgnoreCase("S"));
         System.out.println(jugador1+" ha ganado "+gan1+" veces y "+jugador2+" ha ganado "+gan2+" veces.");
     }
     
     
}

