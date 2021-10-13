package poo_practica8_figuras;
import static java.lang.Math.sqrt;

/**
 *
 * @author null
 */
public class Triangulo extends Figura{
    // Atributos
    private double lado;
    
    // Métodos
    public void LeerDatos(){
        super.LeerDatos();
        nombre = "Triángulo";
        System.out.println(nombre);
        System.out.print("Lado: ");
        lado = input.nextDouble();
    }
    
    public void CalcularPerimetro(){
        perimetro = lado*3;
        System.out.println("Perímetro: " + perimetro + "m");
    }
    
    public void CalcularArea(){
        area = (sqrt(3)/4) * (lado*lado);
        System.out.println("Área: " + String.format("%.2f", area) + "m2");
    }
}