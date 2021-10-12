/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_herencia_polimorfirsmo_12_10_21;

/**
 *
 * @author null
 */
public class Colibri extends Animal{
    // Atributos
    private String alas, pico;
    
    //Constructor
    
    
    // Métodos
    public void alimentarse(){
        super.alimentarse();
        System.out.println("\tColibrí dice: terminé de comer...");
        System.out.println("\tVolaré feliz!");
    }
    
    public void cantar(){
        
    }
    
    public void volar(){
        
    }
}
