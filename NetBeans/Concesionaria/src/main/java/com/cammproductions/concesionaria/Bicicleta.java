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
public class Bicicleta extends Vehiculo {
    private String color;
    private String tipo;

    public Bicicleta() {
    }

    public Bicicleta(String color, String tipo, int numSerie, String marca) {
        super(numSerie, marca);
        this.color = color;
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
