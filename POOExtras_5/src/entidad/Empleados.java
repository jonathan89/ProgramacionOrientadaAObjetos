/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author Yesica Rocio Gill
 * Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". 
 * Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un 
 * empleado en función de su edad y salario actual. El aumento salarial debe ser 
 * del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.

 */
public class Empleados {
    String nombre;
    int edad;
    double salario,aumento;

    public Empleados() {
    }

    public Empleados(String nombre, int edad, double salario, double aumento) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.aumento = aumento;
    }

    public void calcular_aumento(){
        Scanner var=new Scanner (System.in);
        System.out.println("Ingrese el nombre del empleado:");
        nombre=var.next();
        System.out.println("Ingrese la edad del empleado:");
        edad=var.nextInt();
        System.out.println("Ingrese el salario actual del empleado:");
        salario=var.nextDouble();
        if (edad>=30) {
            System.out.println("Usted percibirá un aumento del 10% y su salario aumentaría a $"+salario*1.10);
                    } else { 
            System.out.println ("Usted percibirá un aumento del 5% y su salario aumentaría a $"+salario*1.05);
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getAumento() {
        return aumento;
    }

    public void setAumento(double aumento) {
        this.aumento = aumento;
    }
    
}
