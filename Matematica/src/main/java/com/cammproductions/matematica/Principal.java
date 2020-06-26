/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cammproductions.matematica;

/**
 *
 * @author Jess
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Inicializando calculadora");
        Calculadora cuenta=new Calculadora();
        System.out.println();
        cuenta.setNum1(5);
        System.out.println("El Número 1 es: "+cuenta.getNum1());
        cuenta.setNum2(6);
        System.out.println("El Número 2 es: "+cuenta.getNum2());
        System.out.println();
        System.out.println("La Suma de los números ingresados es: "+cuenta.sumar());
        System.out.println();
        System.out.println("La Resta de los números ingresados es: "+cuenta.restar());
        System.out.println();
        System.out.println("La Multiplicación de los números ingresados es: " +cuenta.multiplicar());
        System.out.println();
        System.out.println("La División de los números ingresados es: "+cuenta.dividir());
        System.out.println();
        
        Calculadora cuenta1=new Calculadora();
        System.out.println();
        cuenta1.setNum1(15);
        System.out.println("El Número 1 es: "+cuenta1.getNum1());
        cuenta1.setNum2(10);
        System.out.println("El Número 2 es: "+cuenta1.getNum2());
        System.out.println();
        System.out.println("La Suma de los números ingresados es: "+cuenta1.sumar());
        System.out.println();
        System.out.println("La Resta de los números ingresados es: "+cuenta1.restar());
        System.out.println();
        System.out.println("La Multiplicación de los números ingresados es: " +cuenta1.multiplicar());
        System.out.println();
        System.out.println("La División de los números ingresados es: "+cuenta1.dividir());
        System.out.println();
    }
}
