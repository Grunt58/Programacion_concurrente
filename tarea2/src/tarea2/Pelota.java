/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

/**
 *
 * @author null
 */
public class Pelota {
    
    //ATRIBUTOS    
    private int peso;
    private double precio;
    private int tamanio;
    private String color;
    private String textura;
    private String material;
    private String nombre;
    
    //MÉTODOS
    
    public void basquet(){
        peso = 567;
        precio = 199.00;
        tamanio = 7;
        color = "Cafe";
        textura = "Rugosa";
        material = "caucho";
        nombre = "Baloncesto";
    }
    
    public void football(){
        peso = 450;
        precio = 269.00;
        tamanio = 6;
        color = "Blanco con negro";
        textura = "Liso";
        material = "Cuero";
        nombre = "Soccer";
    }
    
    public void pelota(){
        peso = 25;
        precio = 5.00;
        tamanio = 1;
        color = "Cualquier color";
        textura = "Liso";
        material = "Plastico";
        nombre = "Pelota de juego";
    }
    
    
    public void listar(){
        System.out.println("----------------------");
        System.out.println("Pelota de: " + nombre);
        System.out.println("Tamaño: " + tamanio);
        System.out.println("Peso: " + peso + "g");
        System.out.println("Precio: " + color);
        System.out.println("Textura: " + textura);
        System.out.println("Material: " + material);
        System.out.println("Precio: $" + precio);
        System.out.println("----------------------");
    }
}
