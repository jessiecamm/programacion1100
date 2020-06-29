/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cammproductions.matematica;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

/**
 *
 * @author Jess
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
   
       UIManager UI=new UIManager();
        UIManager.put("Button.background", Color.LIGHT_GRAY);
        UIManager.put("Panel.background",Color.BLACK); 
        UIManager.put("OptionPane.cancelButtonText","Cancelar");
        UIManager.put("OptionPane.okButtonText","Aceptar");
        
       ImageIcon icon = new ImageIcon("/Principal/seo.png");
       String nombreUsuario = JOptionPane.showInputDialog(null, "Ingrese su nombre" ,
               "Bienvenido al Sistema", JOptionPane.QUESTION_MESSAGE);
       
        System.out.println("Bienvenido al sistema "+nombreUsuario+ "!");
        System.out.println();
        System.out.println("Inicializando calculadora...");
        System.out.println();
        
        String primerNumero = JOptionPane.showInputDialog(null, "Ingrese el primer número:" , "Calculadora", JOptionPane.QUESTION_MESSAGE);
        String segundoNumero = JOptionPane.showInputDialog(null, "Ingrese el segundo número:" , "Calculadora", JOptionPane.QUESTION_MESSAGE);
                
        int num2 = Integer.parseInt(segundoNumero);
        int num1 = Integer.parseInt(primerNumero);
        
        Calculadora cuenta=new Calculadora(num1,num2);  
        System.out.println("El primer número ingresado es: "+cuenta.getNum1());
        System.out.println("El segundo número ingresado es: "+cuenta.getNum2());
        System.out.println();
                
        System.out.println("La Suma de los números ingresados es: "+cuenta.sumar());
        System.out.println("La Resta de los números ingresados es: "+cuenta.restar());
        System.out.println("La Multiplicación de los números ingresados es: " +cuenta.multiplicar());
               
        if (cuenta.dividir()==Float.POSITIVE_INFINITY || cuenta.dividir()==Float.NEGATIVE_INFINITY){
            System.out.println("ERROR");
        }else {
            System.out.println("La División de los números ingresados es: "+cuenta.dividir());
               }
      }
}