/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cammproductions.geometria;

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
        
        Rectangulo r1=new Rectangulo(4,3);
        System.out.println("Los datos del rectángulo r1 son: ");
        System.out.println("Base = "+r1.getBase());
        System.out.println("Altura= "+r1.getAltura());
        System.out.println("El área de r1 es: " + r1.calcularArea()+ "cm2.");
        System.out.println();
        Rectangulo r2=new Rectangulo();
        r2.setAltura(2);
        r2.setBase(4);
        System.out.println("Los datos del rectángulo r2 son: ");
        System.out.println("Base = "+r2.getBase());
        System.out.println("Altura= "+r2.getAltura());
        System.out.println("El área de r2 es: "+ r2.calcularArea()+ "cm2.");
        System.out.println();
        Triangulo t1=new Triangulo();
        t1.setAltura(5);
        t1.setBase(6);
        System.out.println("Los datos del triángulo t1 son: ");
        System.out.println("Base = "+t1.getBase());
        System.out.println("Altura= "+t1.getAltura());
        System.out.println("El área de t1 es: " + t1.calcularArea()+ "cm2.");
        System.out.println();
        Triangulo t2=new Triangulo(4,8);
        System.out.println("Los datos del triángulo t2 son: ");
        System.out.println("Base = "+ t2.getBase());
        System.out.println("Altura = "+ t2.getAltura());
        System.out.println("El área de t2 es " +t2.calcularArea()+ "cm2."); 
    }
    
}
