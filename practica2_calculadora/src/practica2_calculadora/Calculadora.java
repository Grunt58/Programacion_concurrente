/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2_calculadora;

import java.util.Scanner;

/**
 *
 * @author null
 */
public class Calculadora {
    private float n1;
    private float n2;
    private Scanner input = new Scanner(System.in);
    
    void Sumar(){
        System.out.print("Número 1: ");
        n1 = input.nextFloat();
        System.out.print("Número 2: ");
        n2 = input.nextFloat();
        float n3 = n1 + n2;
        
        System.out.println("La suma de "+ n1 + " y " + n2 + " es: " + n3);
    }
}
