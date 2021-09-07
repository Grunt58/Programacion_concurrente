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
    
    public Alumno(){
        System.out.println("Se ha creado un objeto de tipo Alumno...");
    }
    public Alumno(String nombre, int cta, int edad){
        System.out.println("Se ha creado un objeto de tipo Alumno usando el segundo constructor");
        this.nombre = nombre;
        cuenta = cta;
        this.edad = edad;
    }
    
    //MÉTODOS
    public void capturar(){
        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        System.out.print("Cuenta: ");
        cuenta = sc.nextInt();
        System.out.print("Edad: ");
        edad = sc.nextInt();
    }
    
    public void listar(){
        System.out.println("Cuenta: " + cuenta + " Nombre: " + nombre + " Edad: " + edad);
    }
}