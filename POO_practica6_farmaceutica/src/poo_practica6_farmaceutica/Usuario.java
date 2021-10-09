package poo_practica6_farmaceutica;
import java.util.Scanner;
/**
 *
 * @author null
 */
public class Usuario {

    // ATRIBUTOS
    private String nombre;
    private int noCuenta, edad;
    private static int idContador = 1;
    Scanner input = new Scanner(System.in);
    
    // CONSTRUCTOR
    Usuario (String nombre, int edad){
        System.out.println("---------------------------------");
        System.out.println("[SERVER]: Nuevo usuario registrado");
        System.out.println("---------------------------------\n");
        this.nombre = nombre;
        this.edad = edad;
        this.noCuenta = idContador++;   
    }
    
    // GETTERS Y SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNoCuenta() {
        return noCuenta;
    }

    public int getEdad() {
        return edad;
    }
    
    // MÉTODOS  
    public String MostrarUsuario() {
        return "Nombre: " + nombre + " || edad: " + edad + " || [No. Cuenta: " + noCuenta + "]";   
    }
}
