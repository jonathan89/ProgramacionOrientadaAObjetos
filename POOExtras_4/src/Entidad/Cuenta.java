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
public class Cuenta {
    double saldo, retiro, aux;
    String  titular, opcion, opcion2;

    public Cuenta() {
    }

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public void retirar_Dinero(){
        Scanner var=new Scanner (System.in);
        saldo=20000.00;                
        System.out.println("Ingrese el nombre del titular:");
        titular=var.next();
        do {
        System.out.println("Su saldo es de $"+saldo);
            if (saldo==0) {
                System.out.println("Usted no posee Saldo disponible");
                break;                
            }
        System.out.println("¿Desea retirar dinero? S/N");
        opcion=var.next();
        if (opcion.equalsIgnoreCase("S")) {
            do {       
            System.out.println("Ingrese el monto a retirar en $:");
            retiro=var.nextDouble();
             } while (retiro>saldo);
            saldo-=retiro;
        }
        System.out.println("Su saldo actual es de $"+saldo);
        System.out.println("¿Desea volver a extraer? S/N");
        opcion2=var.next();
        } while (opcion2.equalsIgnoreCase("S"));
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    
}
