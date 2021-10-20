package herencia.herenciaalumnoprofesor;

import java.util.Scanner;

/**
 *
 * @author null
 */

public class Persona {
    protected String nombre;
    protected int edad;
    protected Direccion direccion;
    public Scanner sc;

    public Persona() {
        direccion = new Direccion(); //relacion de composicion
        this.sc = new Scanner(System.in);
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void capturar(){
        System.out.print("Nombre:");
        sc.nextLine();
        nombre=sc.nextLine();
        System.out.print("Edad: ");
        edad=sc.nextInt();
        System.out.print("Dirección:");
        direccion.capturarDireccion();
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", direccion=" + direccion.toString() + '}';
    }

}

