/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scanner;

import java.util.Scanner;
/**
 *
 * @author null
 */
public class Alumno {
    //ATRIBUTOS
    private int cuenta;
    private String nombre;
    private int edad;
    private Scanner sc = new Scanner(System.in);
    
    //CONTRUCTORES
    
    //MÉTODOS
    public void capturar(){
        System.out.println("Nombre: ");
        nombre = sc.nextLine();
        System.out.println("Cuenta: ");
        cuenta = sc.nextInt();
        System.out.println("Edad: ");
        edad = sc.nextInt();
    }
    
    public void listar(){
        System.out.println("Cuenta: " + cuenta + " Nombre: " + nombre + " Edad: " + edad);
    }
}