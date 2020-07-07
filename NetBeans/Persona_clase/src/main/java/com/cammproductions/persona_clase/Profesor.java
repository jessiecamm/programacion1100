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
public class Profesor extends Persona { //Atributos heredados
    //Atributos propios
    private String materia;
    private String cargo;

    
   //Constructor vacio
    public Profesor() {
    }

    //Constructor lleno
    public Profesor(String materia, String cargo, String nombre, int edad) {
        super(nombre, edad);
        this.materia = materia;
        this.cargo = cargo;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
       
}
