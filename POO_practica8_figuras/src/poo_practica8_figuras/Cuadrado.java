package poo_practica8_figuras;
import java.util.Scanner;

/**
 *
 * @author null
 */
public class Cuadrado extends Figura{
    // Atributo
    private double lado;
    Scanner sc = new Scanner(System.in);
    
    // Métodos
    public void LeerDatos(){
        super.LeerDatos();
        nombre = "Cuadrado";
        System.out.println(nombre);
        System.out.println("Ingrese numero de lados:");
        lado = sc.nextDouble();
    }

    public void calcularperímetro(){
        perimetro = lado * 4;
        System.out.println("Perímetro: "+ perimetro);
    }

    public void calculararea(){
        area = lado * lado;
        System.out.println("Área: " + area);
     }
}
