/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rectangulo;

import java.util.Scanner;

/**
 *
 * @author Yesica Rocio Gill
 */
public class rectangulo {

    private int base, altura;

    public rectangulo() {
    }

    public rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void crearRectangulo() {
        Scanner var = new Scanner(System.in);
        System.out.println("Ingrese la altura del rectangulo: ");
        base = var.nextInt();
        System.out.println("Ingrese la base del rectangulo: ");
        altura = var.nextInt();

    }

    public int superficie() {
        int sup = base * altura;
        return sup;
    }

    public int perimetro() {
        int alt = (base + altura) * 2;
        return alt;
    }

    public void mostrarRectangulo() {
        int[][] matriz = new int[base][altura];
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < altura; j++) {
                if (i == 0 || j == 0 || i == base - 1 || j == altura - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
