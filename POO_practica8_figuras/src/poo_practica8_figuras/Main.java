package poo_practica8_figuras;
import java.util.Scanner;

/**
 *
 * @author null
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuadrado cuad = new Cuadrado();
        Triangulo tri = new Triangulo();
        Circulo cir = new Circulo();
        Rectangulo rect = new Rectangulo();
        
        Scanner input = new Scanner(System.in);
        int op = 0;
        
        do{
            System.out.println("***************************************");
            System.out.println("\t1. Cuadrado");
            System.out.println("\t2. Triángulo");
            System.out.println("\t3. Círculo");
            System.out.println("\t4. Rectangulo");
            System.out.println("\t5. Salir");
            System.out.println("***************************************");
            
            System.out.print("Elija una opción: ");
            op = input.nextInt();
            
            switch(op){
                case 1:
                    cuad.LeerDatos();
                    cuad.CalcularPerímetro();
                    cuad.CalcularArea();
                    break;
                    
                case 2:
                    tri.LeerDatos();
                    tri.CalcularPerimetro();
                    tri.CalcularArea();
                    break;
                     
                case 3:
                    cir.LeerDatos();
                    cir.CalcularPerimetro();
                    cir.CalcularArea();
                    break;
                    
                case 4:
                    rect.LeerDatos();
                    rect.CalcularPerimetro();
                    rect.CalcularArea();
                    break;
                    
                case 5:
                    System.out.println("Saliendo del programa.");
                    break;
                    
                default:
                    System.out.println("Fuera de rango (1-5)");
            }  
        }while(op != 5);
    }
}
