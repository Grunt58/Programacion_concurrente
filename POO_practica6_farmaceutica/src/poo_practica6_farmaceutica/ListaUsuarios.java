package poo_practica6_farmaceutica;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Jorge Tirado Uriza
 */
public class ListaUsuarios {
    // Array para la clase usuarios
    ArrayList <Usuario> listaUsuarios = new ArrayList<Usuario>();
    
    // Scanner
    Scanner input = new Scanner(System.in);
    
    // MÉTODOS
    public void Agregar() throws InputMismatchException{
        String nombre;
        int edad;
        try{
            System.out.println("Introduzca su nombre y edad:");
            System.out.print("Nombre: ");
            nombre = input.nextLine();
            System.out.print("Edad: ");
            edad = input.nextInt();
            listaUsuarios.add(new Usuario(nombre, edad));
        } catch(IncompatibleClassChangeError intError){
            System.out.println("---------------------------------");
            System.out.println("[ERROR]: La edad debe ser un número entero.");
            System.out.println("---------------------------------");
        }
        // Limpiamos el buffer
        input.nextLine();
    }
    
    public void Buscar() {
        System.out.print("Buscar usuario por ID: ");
        int buscar = input.nextInt();
        
        // Limpiamos el buffer
        input.nextLine();
        
        for (Usuario u: listaUsuarios){
            if(u.getNoCuenta() == buscar){
                System.out.println(u.MostrarUsuario());        
            }
        }       
    }
    
    public void Actualizar() throws InputMismatchException{
        String nombre;
        int edad, buscar, op;
        System.out.print("Buscar usuario por ID: ");
        try{
            buscar = input.nextInt();
        
            // Limpiamos el buffer
            input.nextLine();

            for (Usuario u: listaUsuarios){
                if(u.getNoCuenta() == buscar){
                    System.out.println("---------------------------------");
                    System.out.println("Actualizar:");
                    System.out.println("\t1. Nombre");
                    System.out.println("\t2. Edad");
                    System.out.println("\t3. Ambos");
                    System.out.println("---------------------------------");
                    System.out.print(": ");

                    op = input.nextInt();

                    // Limpiamos el buffer
                    input.nextLine();

                    // Ejecutamos la opción que el usuario ingresó
                    switch(op){
                        case 1:
                            System.out.print("Nuevo nombre: ");
                            nombre = input.nextLine();
                            u.setNombre(nombre);
                            System.out.print("\n\n");
                            break;
                        case 2:
                            System.out.print("Nueva edad: ");
                            edad = input.nextInt();
                            u.setEdad(edad);
                            System.out.print("\n\n");
                            // Limpiamos el buffer
                            input.nextLine();
                            break;
                        case 3:
                            System.out.print("Nuevo nombre: ");
                            nombre = input.nextLine();
                            u.setNombre(nombre);
                            System.out.print("\n");
                            System.out.print("Nueva edad: ");
                            edad = input.nextInt();
                            u.setEdad(edad);
                            System.out.print("\n\n");
                            // Limpiamos el buffer
                            input.nextLine();
                            break;
                        default:
                            System.out.println("---------------------------------");
                            System.out.println("[ERROR]: Fuera de rango.");
                            System.out.println("---------------------------------");
                            break;
                    }      
                }
            }
        } catch(IncompatibleClassChangeError intError){
            System.out.println("---------------------------------");
            System.out.println("[ERROR]: La edad debe ser un número entero.");
            System.out.println("---------------------------------");
        }
        // Limpiamos el buffer
        input.nextLine();
    }
    
    public void Borrar() throws ConcurrentModificationException {
        System.out.print("Buscar usuario por ID: ");
        int buscar = input.nextInt();      

        // Manejo de errores
        try {
            for (Usuario u: listaUsuarios){
                if(u.getNoCuenta() == buscar){
                    System.out.println("Usuario [" + u.getNoCuenta() + "] eliminado.");   
                    listaUsuarios.remove(u);
                }
            }
        } catch (ConcurrentModificationException error) {
            // Error raro no se, aun asi el programa si elimina el usuario
        }
        // Limpiamos el buffer
        input.nextLine();
    }
    
    public void OrdenarLista() throws InputMismatchException {
        System.out.println("---------------------------------");
        System.out.println("Ordenar por:");
        System.out.println("\t1. Nombre");
        System.out.println("\t2. Edad");
        System.out.println("\t3. Número de cuenta");
        System.out.println("---------------------------------");
        System.out.print(": ");
        try {
            int op = input.nextInt();
            
            switch(op) {
                case 1:
                    Collections.sort(listaUsuarios, Comparator.comparing(Usuario::getNombre));
                    System.out.println("La lista ha sido organizada por [Nombre] exitosamente.");
                    break;
                case 2:
                    Collections.sort(listaUsuarios, Comparator.comparing(Usuario::getEdad));
                    System.out.println("La lista ha sido organizada por [Edad] exitosamente.");
                    break;
                case 3:
                    Collections.sort(listaUsuarios, Comparator.comparing(Usuario::getNoCuenta));
                    System.out.println("La lista ha sido organizada por [Número de cuenta] exitosamente.");
                    break;
                default:
                    System.out.println("---------------------------------");
                    System.out.println("[ERROR]: Fuera de rango.");
                    System.out.println("---------------------------------");
                    break;
            }
            System.out.print("\n\n");            
        } catch(InputMismatchException intErrr){
            System.out.println("---------------------------------");
            System.out.println("[ERROR]: Elija con un número entero.");
            System.out.println("---------------------------------");
        }
        // Limpiamos el buffer
        input.nextLine();

    }

    public void MostrarLista() {
        System.out.println("-----------------LISTA DE USUARIOS----------------");
        for (Usuario u: listaUsuarios){
            System.out.println(u.MostrarUsuario());
        }
        System.out.println("-----------------LISTA DE USUARIOS----------------");
    }
    
    public void Salir() {
        System.out.println("---------------------------------");
        System.out.println("[SERVER]: Programa terminado.");
        System.out.println("---------------------------------");
    }
}
