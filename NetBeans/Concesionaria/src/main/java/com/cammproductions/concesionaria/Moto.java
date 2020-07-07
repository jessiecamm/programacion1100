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
public class Moto extends Vehiculo {
    private String modelo;
    private String color;
    private int cilindrada;
    private int potencia;

    public Moto() {
    }

    public Moto(String modelo, String color, int cilindrada, int potencia, int numSerie, String marca) {
        super(numSerie, marca);
        this.modelo = modelo;
        this.color = color;
        this.cilindrada = cilindrada;
        this.potencia = potencia;
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

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    
}
