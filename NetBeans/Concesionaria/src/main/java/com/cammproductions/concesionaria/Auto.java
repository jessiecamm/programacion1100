/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cammproductions.concesionaria;

/**
 *
 * @author Jess
 */
public class Auto extends Vehiculo{
    private String modelo;
    private String color;
    private int año;

    public Auto() {
    }

    public Auto(String modelo, String color, int año, int numSerie, String marca) {
        super(numSerie, marca);
        this.modelo = modelo;
        this.color = color;
        this.año = año;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    
}
