package poo_herencia_biblioteca_tarea5;
import java.util.Scanner;

/**
 * @author Equipo 3
 * Luis Fernando Robles Alcala
 * Luis Fernando Hernandez Huerta
 * Magaly Monter Velarde
 * Gerardo Emanuel Bautista Nava
 * Arturo Sebastian Ayala Lorenzo
 * Manuel Alejandro Falfan Cortes
 * Jorge Tirado Uriza
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Biblioteca bl = new Biblioteca();
        Scanner input = new Scanner(System.in);
        int op;
        
        // Menú
        
        
        do{
            System.out.print("""
                         ------------BIBLIOTECA------------
                         \t1. Registrar Socio
                         \t2. Listar Socio
                         \t3. Registrar Material
                         \t4. Listar Material
                         \t5. Buscar Material
                         \t6. Registrar Prestamo
                         \t7. Registrar Devolución
                         \t8. Salir
                         Opción:  """);
            
            op = input.nextInt();
            
            // Limpiamos el buffer
            input.nextLine();
            
            switch(op){
                case 1:
                    bl.registrarSocio();
                    break;
                    
                case 2:
                    bl.listarSocio();
                    break;
                    
                case 3:
                    bl.registrarMaterial();
                    break;
                    
                case 4:
                    bl.listarMaterial();
                    break;
                    
                case 5:
                    bl.buscarMaterial();
                    break;
                    
                case 6:
                    System.out.println("""
                                       Para hacer esta acción requiere inicio de sesión.
                                       **Nota: Al terminar la acción, cerrará sesión automáticamente.
                                       """);
                    bl.registrarPrestamo(bl.socio());
                    break;
                    
                case 7:
                    System.out.println("""
                                       Para hacer esta acción requiere inicio de sesión.
                                       **Nota: Al terminar la acción, cerrará sesión automáticamente.
                                       """);
                    bl.registrarDevolucion(bl.socio());
                    break;
                    
                case 8:
                    bl.Salir();
                    break;
                    
                default:
                    System.out.println("---------------------------------");
                    System.out.println("\tFuera de rango.");
                    System.out.println("---------------------------------");
                    break;
                    
            }
            
        }while(op != 8);
    }
    
}
