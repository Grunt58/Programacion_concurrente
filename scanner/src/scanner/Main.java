/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scanner;

/**
 *
 * @author null
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

        Alumno alumno, alumno2, alumno3;
        alumno = new Alumno();
        alumno2 = new Alumno();
        alumno3 = new Alumno();
        
        System.out.println("Capturando datos de los alumnos");
        alumno.capturar();
        alumno2.capturar();
        alumno3.capturar();
        
        System.out.println("Información de los alumnos");
        alumno.listar();
        alumno2.listar();
        alumno3.listar();
        
    }
}
