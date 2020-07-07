/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cammproductions.persona_clase;

/**
 *
 * @author Jess
 */
public class Estudiante extends Persona { //atributos heredados
  //atributos propios
    private String carrera;
    private int legajo;

    //constructor vacio
    public Estudiante() {
    }

    //constructor lleno
    public Estudiante(String carrera, int legajo, String nombre, int edad) {
        super(nombre, edad);
        this.carrera = carrera;
        this.legajo = legajo;
    }
     
    //getters and setters
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }  
    
}
