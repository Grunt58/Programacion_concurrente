package poo_practica8_figuras;
import static java.lang.Math.PI;
import static java.lang.Math.pow;

/**
 *
 * @author 

 */
public class Circulo extends Figura{
    // Atributos
    private double radio;
    
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
        System.out.println("Perímetro: " + perimetro + "m");
    }
    
    public void CalcularArea(){
        area = (Math.pow(radio, 2))*PI;
        System.out.println("Área: " + area + "m2");
    }    
}
