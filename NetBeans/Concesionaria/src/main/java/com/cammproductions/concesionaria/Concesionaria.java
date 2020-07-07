/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cammproductions.concesionaria;

import javax.swing.JOptionPane;
import java.awt.Color;
import javax.swing.UIManager;

/**
 *
 * @author Jess
 */
public class Concesionaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        System.out.println("Concesionaria Vehículos Random");
        
        UIManager UI=new UIManager();
        UIManager.put("Button.background", Color.CYAN);
        UIManager.put("Panel.background",Color.LIGHT_GRAY); 
        UIManager.put("OptionPane.cancelButtonText","Cancelar");
        UIManager.put("OptionPane.okButtonText","Aceptar");
                
        Bicicleta bici1=new Bicicleta();
        bici1.setMarca("Merida");
        bici1.setNumSerie(562345);
        bici1.setColor("Rojo");
        bici1.setTipo("Mountan bike");
        
        Bicicleta lista_bici[]=new Bicicleta[2];
        for(int i=0; i<2; i++){
            String marca=JOptionPane.showInputDialog(null, "Inserte la marca de la vehículo: ",
                    "BICICLETA", JOptionPane.INFORMATION_MESSAGE);
            int numSerie=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de serie del vehículo: ",
                    "BICICLETA", JOptionPane.INFORMATION_MESSAGE));
            String color=JOptionPane.showInputDialog(null, "Ingrese el color del vehículo: ",
                    "BICICLETA", JOptionPane.INFORMATION_MESSAGE);
            String tipo=JOptionPane.showInputDialog(null, "Ingrese el tipo del vehículo (paseo, montaña, deportiva): ",
                    "BICICLETA", JOptionPane.INFORMATION_MESSAGE);
        }       
        
        Moto moto1=new Moto();
        moto1.setMarca("Kawasaki");
        moto1.setNumSerie(3547856);
        moto1.setModelo("Ninja");
        moto1.setCilindrada(399);
        moto1.setPotencia(45);
        
        Moto lista_moto[]=new Moto[2];
        for(int i=0; i<2; i++){
            String marca=JOptionPane.showInputDialog(null, "Inserte la marca de la vehículo: ",
                    "MOTOCICLETA", JOptionPane.QUESTION_MESSAGE);
            int numSerie=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de serie del vehículo: ",
                    "MOTOCICLETA", JOptionPane.QUESTION_MESSAGE));
            String modelo=JOptionPane.showInputDialog(null, "Ingrese el modelo del vehículo: ",
                    "MOTOCICLETA", JOptionPane.QUESTION_MESSAGE);
            int cilindrada=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de cilindrada: ",
                    "MOTOCICLETA", JOptionPane.QUESTION_MESSAGE));
            int potencia=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de potencia (CF): ",
                    "MOTOCICLETA", JOptionPane.QUESTION_MESSAGE));
        }
        
        Auto auto1=new Auto();
        auto1.setMarca("Alfa Romeo");
        auto1.setNumSerie(324452);
        auto1.setColor("Azul Marino");
        auto1.setModelo("Giulietta");
        auto1.setAño(2015);
        
        Auto lista_auto[]=new Auto[2];
        for(int i=0; i<2; i++){
            String marca=JOptionPane.showInputDialog(null, "Inserte la marca del vehículo: ",
                    "AUTOMOVIL", JOptionPane.ERROR_MESSAGE);
            int numSerie=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de serie del vehículo: ",
                     "AUTOMOVIL", JOptionPane.ERROR_MESSAGE));
            String color=JOptionPane.showInputDialog(null, "Ingrese el color del vehículo: ",
                     "AUTOMOVIL", JOptionPane.ERROR_MESSAGE);
            String modelo=JOptionPane.showInputDialog(null, "Ingrese el modelo del vehículo: ",
                     "AUTOMOVIL", JOptionPane.ERROR_MESSAGE);
            int año=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el año del vehículo: ",
                     "AUTOMOVIL", JOptionPane.ERROR_MESSAGE));
        }
        
        System.out.println("Vehículos en Stock");
        System.out.println();
        
        System.out.println("Bicicletas");
        System.out.printf("Marca: %s, Número de Serie: %d, Color: %s, Tipo: %s \n", bici1.getMarca(), bici1.getNumSerie(), bici1.getColor(), bici1.getTipo());
        for (int i=0; i>1; i++){
           System.out.printf("Marca: %s, Número de Serie: %d, Color: %s, Tipo: %s \n", lista_bici[i].getMarca(), lista_bici[i].getNumSerie(), lista_bici[i].getColor(), lista_bici[i].getTipo());
        }
        
        System.out.println("Motocicletas");
        System.out.printf("Marca: %s, Número de Serie: %d, Color: %s, Cilindrada: %d, Potencia: %d \n", moto1.getMarca(), moto1.getNumSerie(), moto1.getColor(), moto1.getCilindrada(), moto1.getPotencia());
        for (int i=0; i>1; i++){
           System.out.printf("Marca: %s, Número de Serie: %d, Color: %s, Cilindrada: %d, Potencia: %d \n", lista_moto[i].getMarca(), lista_moto[i].getNumSerie(), lista_moto[i].getColor(), lista_moto[i].getCilindrada(),lista_moto[i].getPotencia());
        }
                
        System.out.println("Automóviles");
        System.out.printf("Marca: %s, Número de Serie: %d, Modelo: %s, Color: %s, Año: %d \n", auto1.getMarca(), auto1.getNumSerie(), auto1.getModelo(), auto1.getColor(), auto1.getAño());
        for (int i=0; i>1; i++){
           System.out.printf("Marca: %s, Número de Serie: %d, Modelo: %s, Color: %s, Año: %d \n", lista_auto[i].getMarca(), lista_auto[i].getNumSerie(), lista_auto[i].getModelo(), lista_auto[i].getColor(), lista_auto[i].getAño());
        }
    }
}
