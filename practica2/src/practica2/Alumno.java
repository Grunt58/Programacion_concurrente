/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

/**
 *
 * @author null
 */
public class Alumno {
    //ATRIBUTOS
    private int cuenta;
    private String nombre;
    private int edad;
    
    //CONTRUCTORES
    
    //MÉTODOS
    public void capturar(){
        cuenta = 999;
        edad = 100;
        nombre = "Juanito...";
    }
    
    public void listar(){
        System.out.println("Cuenat: " + cuenta + " Nombre: " + nombre + " Edad: " + edad);
    }
}
