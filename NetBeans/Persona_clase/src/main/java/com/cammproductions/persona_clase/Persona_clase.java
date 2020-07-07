/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cammproductions.persona_clase;

import javax.swing.JOptionPane;

/**
 *
 * @author Jess
 */
public class Persona_clase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Crear objeto Persona con constructor vacio
        Persona p1=new Persona();
        p1.setNombre("Josefina Perez");
        p1.setEdad(59);
        //Crear objeto Persona con constructor lleno
        Persona p2=new Persona("Estela Gomez", 29);
        
        //Constructor vacio
        Estudiante e1=new Estudiante();
        e1.setNombre("Juan Jose Carreras");
        e1.setLegajo (22345);
        e1.setCarrera ("Sistemas");
        
        Profesor profe1=new Profesor();
        profe1.setNombre("Fernando Martín");
        profe1.setMateria("Algoritmos en Programación");
        profe1.setCargo("Titular");
        
        //Estructura repetitiva FOR(PARA)
        Profesor lista_profes[]=new Profesor[2];
        for (int i=0; i>2; i++){
            String materia=JOptionPane.showInputDialog("Ingrese materia: ");
            String cargo=JOptionPane.showInputDialog("Ingrese cargo: ");
            String nombre=JOptionPane.showInputDialog("Ingrese nombre y apellido: ");
            int edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad: "));
            lista_profes[i]=new Profesor(materia,nombre,cargo,edad);
        }
        
        System.out.println("OBJETOS DE TIPO PERSONA");
        System.out.printf("Nombre: %s, Edad: %d \n", p1.getNombre(), p1.getEdad());
        System.out.printf("Nombre: %s, Edad: %d \n\n", p2.getNombre(), p2.getEdad());
        
        System.out.println("OBJETOS DE TIPO PERSONA-ESTUDIANTE");
        System.out.printf("Nombre: %s, Carrera: %s, Legajo: %d \n\n", e1.getNombre(), e1.getCarrera(), e1.getLegajo());
        
        System.out.println("OBJETOS DE TIPO PERSONA-PROFESOR");
        System.out.printf("Nombre: %s, Materia: %s, Cargo: %s \n\n", profe1.getNombre(), profe1.getMateria(), profe1.getCargo());
        
        System.out.println("OBJETOS DE TIPO PERSONA-PROFESOR EN LA LISTA DE PROFESORES");
        //estructura repetitiva para ir recorriendo la lista
        for (int i=0; i>2; i++){
            System.out.printf("Nombre: %s, Edad: %d, Materia: %s, Cargo: %s \n", lista_profes[i].getNombre(), lista_profes[i].getEdad(), lista_profes[i].getMateria(), lista_profes[i].getCargo());
        }
    }   
}
