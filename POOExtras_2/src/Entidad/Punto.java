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
public class Punto {
    double x1,x2,y1,y2;

    public Punto() {
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public Punto(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    public void crearPuntos(){
        Scanner var=new Scanner (System.in);
        System.out.println("Ingrese los valores del Punto 1: ");
        x1=var.nextDouble();
        y1=var.nextDouble();
        System.out.println("Ingrese los valores del Punto 2: ");
        x2=var.nextDouble();
        y2=var.nextDouble();
    }
    public double distancia(){
        double dist=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        return dist;
    }
}
