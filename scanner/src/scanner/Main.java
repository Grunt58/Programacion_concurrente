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
        

        Alumno alumno, alumno2, alumno3;//Se crean variables a partir de la clase Alumno
        alumno = new Alumno();
        alumno2 = new Alumno();

        
        System.out.println("Capturando datos de los alumnos");
        alumno.capturar();
        alumno2.capturar();
        alumno3 = new Alumno("Juanito", 12, 32); // Se crea el objeto de alumno3
        
        
        System.out.println("Información de los alumnos");
        alumno.listar();
        alumno2.listar();
        alumno3.listar();
        
    }
}
