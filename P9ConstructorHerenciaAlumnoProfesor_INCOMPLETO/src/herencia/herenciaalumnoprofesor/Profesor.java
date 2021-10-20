package herencia.herenciaalumnoprofesor;

import java.util.Scanner;

/**
 *
 * @author null
 */

public class Profesor extends Persona{
    private int clave;
    private String RFC;
    
    public Profesor(){
        
    }
    
    public Profesor(String nombre, int clave, String RFC){
        this.clave = clave;
        this.RFC = RFC;
        this.nombre = nombre;
    }

    @Override
    public void capturar(){
        System.out.print("RFC: ");
        RFC = sc.nextLine();
        System.out.print("Clave: ");
        clave = sc.nextInt();
        super.capturar();
    }

    @Override
    public String toString() {
        return "Profesor{" + "clave=" + clave + ", RFC=" + RFC + super.toString() +'}';
    } 
}
