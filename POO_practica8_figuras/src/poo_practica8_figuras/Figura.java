package poo_practica8_figuras;
import java.util.Scanner;

/**
 *
 * @author null
 */
public class Figura {
    // Atributos
    protected double area, perimetro;
    protected String nombre;
    protected Scanner input = new Scanner(System.in);

 
    // Métodos
    public void LeerDatos(){
        System.out.print("Datos de la figura: ");
    }
}