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
public class Triangulo {
    private int base;
    private int altura;

    public Triangulo() {
    }

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public int calcularArea(){
        int resultado;
        resultado=(base*altura)/2;
        return resultado;
    }
}
