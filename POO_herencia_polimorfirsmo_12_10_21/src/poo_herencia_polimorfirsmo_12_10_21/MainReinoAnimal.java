/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_herencia_polimorfirsmo_12_10_21;

/**
 *
 * @author Joreg Tirado Uriza
 */
public class MainReinoAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Ballena
        Ballena mobyDick = new Ballena();
        System.out.println("La ballena Moby-Dick dice: ");
        
        mobyDick.alimentarse();
        
        // Colibrí
        Colibri colores = new Colibri();
        System.out.println("Mi colibrí colores:");
        
        colores.alimentarse();
        
        // Gato
        Gato minino = new Gato();
        System.out.println("Mi gato minino dice: ");
        minino.alimentarse();
    }   
}