package poo_practica8_figuras;

/**
 *
 * @author 

 */
public class Cuadrado extends Figura{
    // Atributo
    private double lado;
    
    // Métodos
    public void LeerDatos(){
        super.LeerDatos();
        nombre = "Cuadrado";
        System.out.println(nombre);
        System.out.println("Ingrese numero de lados:");
        lado = input.nextDouble();
    }

    public void calcularperímetro(){
        perimetro = lado * 4;
        System.out.println("Perímetro: " + perimetro + "m");
    }

    public void calculararea(){
        area = lado * lado;
        System.out.println("Área: " + area + "m2");
     }
}
