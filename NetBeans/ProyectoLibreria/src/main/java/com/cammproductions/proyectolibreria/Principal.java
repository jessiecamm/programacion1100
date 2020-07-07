/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cammproductions.proyectolibreria;

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
        System.out.println("Librería Camm");
        Lapicera lapi1=new Lapicera("Bic",3,"Azul");
        Lapicera lapi2=new Lapicera("Faber Castel",32,"Azul");
        System.out.println(lapi1.mostrarPorPantalla());
        System.out.println(lapi2.mostrarPorPantalla());
        
        Lapicera lapi3=new Lapicera();
        lapi3.setMarca("Pilot");
        lapi3.setModelo(78);
        lapi3.setColor("Rojo");
        System.out.println(lapi3.mostrarPorPantalla());
        
        Regla regla1=new Regla();
        regla1.setMarca("Plantec");
        regla1.setLongitud(50);
        regla1.setMaterial("plástico");
        System.out.println(regla1.mostrarPorPantalla());
        
        Regla regla2=new Regla();
        regla2.setMarca("Pizzini");
        regla2.setLongitud(100);
        regla2.setMaterial("metal");
        System.out.println(regla2.mostrarPorPantalla());
        
        Regla regla3=new Regla();
        regla3.setMarca("Mapel");
        regla3.setLongitud(20);
        regla3.setMaterial("plástico");
        System.out.println(regla3.mostrarPorPantalla());
    }
    
    
}
