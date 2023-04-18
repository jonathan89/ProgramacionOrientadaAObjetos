/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un método 
 * "calcular_area" que calcule y devuelva el área del rectángulo. Luego crea un 
 * objeto "rectangulo1" de la clase "Rectángulo" con lados de 4 y 6 y imprime el área del rectángulo.

 * @author Yesica Rocio Gill
 */
public class Rectangulo {
    double lado1, lado2;

    public Rectangulo() {
    }

    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double calcular_area(){
        double aux=lado1*lado2;
        return aux;
    }
        
    
    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    
}
