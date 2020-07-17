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
public class Trapecio implements Calculo {
    private float base1;
    private float base2;
    private float altura;

    public Trapecio() {
    }

    public Trapecio(float base1, float base2, float altura) {
        this.base1 = base1;
        this.base2 = base2;
        this.altura = altura;
    }

    public float getBase1() {
        return base1;
    }

    public void setBase1(float base1) {
        this.base1 = base1;
    }

    public float getBase2() {
        return base2;
    }

    public void setBase2(float base2) {
        this.base2 = base2;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public float CalcularArea() {
       float resultado=((base1+base2)*altura)/2;
       return resultado;
    }
}
