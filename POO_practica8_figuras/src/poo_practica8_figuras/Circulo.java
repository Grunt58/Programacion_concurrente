package poo_practica8_figuras;
import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *
 * @author null
 */
public class Circulo extends Figura{
    // Atributos
    private double radio;
    Scanner input = new Scanner(System.in);
    
    // Métodos
    public void LeerDatos(){
        super.LeerDatos();
        nombre = "Cuadrado";
        System.out.println(nombre);
        System.out.print("Ingrese el valor del radio: ");
        radio = input.nextDouble();
    }
    
    public void CalcularPerimetro(){
        perimetro = (2*PI)*radio;
        System.out.println("Perímetro: " + perimetro);
    }
    
    public void CalcularArea(){
        area = PI*(radio*radio);
        System.out.println("Área: " + area);
    }    
}
