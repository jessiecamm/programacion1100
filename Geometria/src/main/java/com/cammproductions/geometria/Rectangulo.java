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
public class Rectangulo {
    //Atributos
    private int base;
    private int altura;
    
    //Constructores
    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    //Métodos
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
    
    //Área del rectángulo
    public int calcularArea(){
        int resultado;
        resultado=base * altura;
        return resultado;
    }

}
