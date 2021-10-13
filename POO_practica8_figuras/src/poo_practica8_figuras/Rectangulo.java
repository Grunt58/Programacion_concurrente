package poo_practica8_figuras;

/**
 *
 * @author null
 */
public class Rectangulo extends Figura{
    // Atributos
    private double ladoA, ladoB;
    
    // Métodos
    public void LeerDatos(){
        super.LeerDatos();
        nombre = "Rectángulo";
        System.out.println(nombre);
        System.out.print("Ingrese el valor del Lado A: ");
        ladoA = input.nextDouble();
        
        System.out.print("Ingrese el valor del Lado B: ");
        ladoB = input.nextDouble();
    }
    
    public void CalcularPerimetro(){
        perimetro = ladoA*2 + ladoB*2;
        System.out.println("Perímetro: " + perimetro + "m");
    }
    
    public void CalcularArea(){
        area = ladoA*ladoB;
        System.out.println("Área: " + area + "m2");
    }
}
