/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

/**
 *
 * @author Jorge Tirado Uriza
 * Josue Ignacio Robles Mendoza
 * Leonardo Hernandez Cuevas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Pelota pelota_1 = new Pelota();
        Pelota pelota_2 = new Pelota();
        Pelota pelota_3 = new Pelota();
        
        pelota_1.basquet();
        pelota_1.listar();
        
        pelota_2.football();
        pelota_2.listar();
        
        pelota_3.pelota();
        pelota_3.listar();
    }
    
}
