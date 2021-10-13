package poo_practica8_figuras;

/**
 *
 * @author null
 */
public class Cuadrado extends Figura{
    // Atributo
    private double lado;
    
    // Métodos
    public void LeerDatos(){
        super.LeerDatos();
        nombre = "Cuadrado";
        System.out.println(nombre);
        System.out.print("Ingrese valor de lados: ");
        lado = input.nextDouble();
    }

    public void CalcularPerímetro(){
        perimetro = lado * 4;
        System.out.println("Perímetro: " + perimetro + "m");
    }

    public void CalcularArea(){
        area = lado * lado;
        System.out.println("Área: " + area + "m2");
     }
}