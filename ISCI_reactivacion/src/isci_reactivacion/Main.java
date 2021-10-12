package isci_reactivacion;
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
        int noCuenta, cProd, precio, total;
        String nombre, fecha;
        Scanner input = new Scanner(System.in);
        
        // asignación de variables
        noCuenta = 58;
        precio = 49;
        cProd = 3;
        total = cProd*precio;
        
        fecha = "11/10/21";
        
        System.out.print("Nombre: ");
        nombre = input.nextLine();
        
        
        // menú
        System.out.println("\n\n\tTienda de auto servicio De \"todo\"");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("\tNo. De cliente: \"" + noCuenta + "\"");
        System.out.println("\tNombre del cliente: \"" + nombre + "\"");
        System.out.println("\tTotal de compra: \"" + total + "$\"");
        System.out.println("\tFecha de compra: \"" + fecha + "\"");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");   
    }  
}