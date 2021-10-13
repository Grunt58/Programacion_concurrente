package poo_practica8_figuras;
import java.util.Scanner;

/**
 *
 * @author null
 */
public class Rectangulo extends Figura{
    // Atributos
    private double ladoA, ladoB;
    Scanner input = new Scanner(System.in);
    
    // Métodos
    public void LeerDatos(){
        super.LeerDatos();
        nombre = "Cuadrado";
        System.out.println(nombre);
        System.out.print("Ingrese el valor del Lado A: ");
        ladoA = input.nextDouble();
        
        System.out.print("Ingrese el valor del Lado B: ");
        ladoB = input.nextDouble();
    }
    
    public void CalcularPerimetro(){
        perimetro = ladoA*2 + ladoB*2;
        System.out.println("Perímetro: " + perimetro);
    }
    
    public void CalcularArea(){
        area = ladoA*ladoB;
        System.out.println("Área: " + area);
    }
}
