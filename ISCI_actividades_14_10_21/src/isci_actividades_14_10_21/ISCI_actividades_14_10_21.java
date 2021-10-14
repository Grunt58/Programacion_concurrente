package isci_actividades_14_10_21;
import java.util.Scanner;

/**
 *
 * @author null
 */
public class ISCI_actividades_14_10_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        // Reactivación
        // Constantes
        double g_verde=20.33, g_roja=22.90, g_negra=19.25;
        
        // Variables
        String nombre="", gas="", d_nombre="";
        int no_cliente=1, litros=0, frec=0, tipo_gas=0;
        double subtotal=0, descuento=0.20, iva=0.16, total=0;
        boolean frecuente=false, pass=false;
        
        // Variables auxiliares
        double lit_gas=0, desc_true=0, gas_iva=0;   
        
        System.out.println("¿Cuál es su nombre?");
        nombre = input.nextLine();

        System.out.println("¿Es cliente frecuente?\n\t1. Si\n\t2. No");
        frec = input.nextInt();
        if(frec == 1){
            d_nombre = "20%";
            frecuente=true;
        } else {
            d_nombre = "0%";
            frecuente=false;
        }

        System.out.println("\tMenú:");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Tipo de gasolina\tPrecio $");
        System.out.println("Verde\t" + g_verde);
        System.out.println("Roja\t" + g_roja);
        System.out.println("Negra\t" + g_negra);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");

        System.out.print("Litros: ");
        litros = input.nextInt();

        System.out.println("Tipo de gasolina:\n\t1. Verde\n\t2. Roja\n\t3. Negra");
        tipo_gas = input.nextInt();

        switch(tipo_gas){
            case 1:
                gas = "Verde";
                subtotal = litros * g_verde;
                lit_gas = subtotal;
                
                if(frecuente == true){
                    desc_true = lit_gas*descuento;
                    lit_gas -= desc_true;
                }
                
                gas_iva = lit_gas*iva;
                total = lit_gas + gas_iva;
                
                pass = true;
                break;

            case 2:
                gas = "Roja";
                subtotal = litros * g_roja;
                lit_gas = subtotal;

                if(frecuente == true){
                    desc_true = lit_gas*descuento;
                    lit_gas -= desc_true;
                }
                
                gas_iva = lit_gas*iva;
                total = lit_gas + gas_iva;
                
                pass = true;
                break;

            case 3:
                gas = "Negra";
                subtotal = litros * g_negra;
                lit_gas = subtotal;

                if(frecuente == true){
                    desc_true = lit_gas*descuento;
                    lit_gas -= desc_true;
                }
                
                gas_iva = lit_gas*iva;
                total = lit_gas + gas_iva;
                
                pass = true;
                break;

            default:
                System.out.println("Fuera de rango (1-3)");
        }

        if(pass == true){
            System.out.println("\tGasolinería GASPar");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("\tNo. De cliente: " + no_cliente);
            System.out.println("\tNombre del cliente: " + nombre);
            System.out.println("\tCantidad de litros: " + litros);
            System.out.println("\tTipo de combustible: " + gas);
            System.out.println("Subtotal: " + String.format("%.2f", subtotal));
            System.out.println("Descuento: " + d_nombre + " | " + String.format("%.2f", desc_true));
            System.out.println("IVA 16%: " + String.format("%.2f", gas_iva));
            System.out.println("Total a pagar: " + String.format("%.2f", total));
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        }
    }   
}
