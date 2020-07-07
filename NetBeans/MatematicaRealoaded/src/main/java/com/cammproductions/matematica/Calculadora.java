/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cammproductions.matematica;

/**
 *
 * @author Jess
 */
public class Calculadora {
    private float num1;
    private float num2;

    public Calculadora() {
    }

    public Calculadora(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }
    
    public float sumar(){
        float suma=num1+num2;
        return suma;
    }
    
    public float restar(){
        float resta=num1-num2;
        return resta;
    }
    
    public float multiplicar(){
        float multiplicacion=num1*num2;
        return multiplicacion;
    }
    
    public float dividir(){
        float division;
        division=(float)num1/num2;
        return division;
    }
    
}