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
        System.out.println("CALCULANDO ÁREAS");
        System.out.println();
        System.out.println("RECTANGULOS");
        Rectangulo r1=new Rectangulo(4,3);
        System.out.println("Los datos del rectángulo r1 son: ");
        System.out.println("Base = "+r1.getBase());
        System.out.println("Altura= "+r1.getAltura());
        System.out.println("El área de r1 es: " + r1.CalcularArea()+ " cm2.");
        System.out.println();
        Rectangulo r2=new Rectangulo();
        r2.setAltura(2);
        r2.setBase(4);
        System.out.println("Los datos del rectángulo r2 son: ");
        System.out.println("Base = "+r2.getBase());
        System.out.println("Altura= "+r2.getAltura());
        System.out.println("El área de r2 es: "+ r2.CalcularArea()+ " cm2.");
        System.out.println();
        System.out.println("TRIÁNGULOS");
        Triangulo t1=new Triangulo();
        t1.setAltura(5);
        t1.setBase(6);
        System.out.println("Los datos del triángulo t1 son: ");
        System.out.println("Base = "+t1.getBase());
        System.out.println("Altura= "+t1.getAltura());
        System.out.println("El área de t1 es: " + t1.CalcularArea()+ " cm2.");
        System.out.println();
        Triangulo t2=new Triangulo(4,8);
        System.out.println("Los datos del triángulo t2 son: ");
        System.out.println("Base = "+ t2.getBase());
        System.out.println("Altura = "+ t2.getAltura());
        System.out.println("El área de t2 es " +t2.CalcularArea()+ " cm2."); 
        System.out.println();
        System.out.println("CUADRADOS");
        Cuadrado c1=new Cuadrado (8,8);
        System.out.println("El área del cuadrado c1 es " +c1.CalcularArea()+ " cm2.");
        System.out.println();
        Cuadrado c2=new Cuadrado();
        c2.setLado1(15);
        c2.setLado2(15);
        System.out.println("Los lados del cuadrado c2 miden: " +c2.getLado1());
        System.out.println("El área del cuadrado c2 es " +c2.CalcularArea()+ " cm2.");
        System.out.println();
        System.out.println("TRAPECIOS");
        Trapecio trap1=new Trapecio (10,15,20);
        System.out.println("El área del trapecio trap1 es " +trap1.CalcularArea()+ " cm2.");
        System.out.println();
        Trapecio trap2=new Trapecio();
        trap2.setBase1(23);
        trap2.setBase2(16);
        trap2.setAltura(26);
        System.out.println("Los datos del trapecio trap2 son:");
        System.out.println("Base1 = " +trap2.getBase1());
        System.out.println("Base2 = " +trap2.getBase2());
        System.out.println("Altura = " +trap2.getAltura());
        System.out.println("El área del trapecio trap2 es " +trap2.CalcularArea()+ " cm2.");
    }
}
