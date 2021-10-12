/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_herencia_polimorfirsmo_12_10_21;

/**
 *
 * @author Jorge Tirado Uriza
 */
public class Gato extends Animal{
    // Atributos
    private String alas, pico;
    
    //Constructor
    
    
    // Métodos
    public void alimentarse(){
        System.out.println("\tEsperando a mi presa...");
        System.out.println("\tComiendo...");
        System.out.println("\tEl gato dice: termine de comer");
    }
}
