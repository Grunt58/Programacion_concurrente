package poo_practica6_farmaceutica;

import java.util.Scanner;
/**
 *
 * @author null
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        ListaUsuarios lu = new ListaUsuarios();
        
        int op;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("-----------------FARMACÉUTICA----------------");
            System.out.println("\t1. Registrar nuevo usuario");
            System.out.println("\t2. Buscar usuario");
            System.out.println("\t3. Actualizar usuario");
            System.out.println("\t4. Borrar usuario");
            System.out.println("\t5. Ordenar lista de usuarios");
            System.out.println("\t6. Mostrar lista de usuarios");
            System.out.println("\t7. Salir del programa.");
            System.out.println("-----------------FARMACÉUTICA----------------\n\n");
            System.out.print("Elija una opción: ");
        
            op = input.nextInt();
            System.out.print("\n\n");
            switch(op){
                case 1:
                    lu.Agregar();
                    break;
                case 2:
                    lu.Buscar();
                    break;
                case 3:
                    lu.Actualizar();
                    break;
                case 4:
                    lu.Borrar();
                    break;
                case 5:
                    lu.OrdenarLista();
                    break;
                case 6:
                    lu.MostrarLista();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("---------------------------------");
                    System.out.println("[ERROR]: Fuera de rango.");
                    System.out.println("---------------------------------");
                    break;
            }
            // Limpiamos el buffer
            input.nextLine();
        } while(op != 7);
        lu.Salir();   
    }
}
