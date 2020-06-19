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
public class Regla {
     //Atributos de la clase
    private String marca;
    private int longitud;
    private String material;   
    
    //Código constructor
    public Regla(String marca, int longitud, String material) {
        this.marca = marca;
        this.longitud = longitud;
        this.material = material;    
    }

     //Constructor alternativo (vacío), completar los datos a posteriori
    public Regla() {
    }
    
    //Getters and setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    //Mosrtar por pantalla

    public String mostrarPorPantalla() {
        return "Regla {" + " La marca es: " + marca + ", su longitud: " + longitud + " cm. y el material: " + material + "." + '}';
    }
    
   
    
    
}


