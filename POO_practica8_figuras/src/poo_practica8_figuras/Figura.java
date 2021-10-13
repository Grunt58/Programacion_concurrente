package poo_practica8_figuras;
import java.util.Scanner;

/**
 *
 * @author 

 */
public class Figura {
    // Atributos
    protected double area, perimetro;
    protected String nombre;
    protected Scanner input = new Scanner(System.in);

 
    // Métodos
    public void LeerDatos(){
        System.out.println("Datos de la figura: ");
    }
}
