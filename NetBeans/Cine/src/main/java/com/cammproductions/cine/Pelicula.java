/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cammproductions.cine;

/**
 *
 * @author Jess
 */
public class Pelicula {
    private int añoEstreno;
    private boolean disponible;
    private int duracion;
    private String nombre;
    private String tituloOriginal;
    private boolean estaDisponible;
    private boolean estaEnCartera;
    
    private Genero genero;
    private Calificacion calificacion;

    public Pelicula() {
    }

    public Pelicula(int añoEstreno, boolean disponible, int duracion, String nombre, String tituloOriginal, boolean estaDisponible, boolean estaEnCartera, Genero genero, Calificacion calificacion) {
        this.añoEstreno = añoEstreno;
        this.disponible = disponible;
        this.duracion = duracion;
        this.nombre = nombre;
        this.tituloOriginal = tituloOriginal;
        this.estaDisponible = estaDisponible;
        this.estaEnCartera = estaEnCartera;
        this.genero = genero;
        this.calificacion = calificacion;
    }

    public int getAñoEstreno() {
        return añoEstreno;
    }

    public void setAñoEstreno(int añoEstreno) {
        this.añoEstreno = añoEstreno;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTituloOriginal() {
        return tituloOriginal;
    }

    public void setTituloOriginal(String tituloOriginal) {
        this.tituloOriginal = tituloOriginal;
    }

    public boolean isEstaDisponible() {
        return estaDisponible;
    }

    public void setEstaDisponible(boolean estaDisponible) {
        this.estaDisponible = estaDisponible;
    }

    public boolean isEstaEnCartera() {
        return estaEnCartera;
    }

    public void setEstaEnCartera(boolean estaEnCartera) {
        this.estaEnCartera = estaEnCartera;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Calificacion calificacion) {
        this.calificacion = calificacion;
    }

}