package poo_herencia_biblioteca_tarea5;
import java.util.ArrayList;
import java.util.InputMismatchException;
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
public class Biblioteca {
    // Array para la los objetos Libros, Revistas y Socios
    ArrayList <Libro> listaLibros = new ArrayList<>();
    ArrayList <Revista> listaRevista = new ArrayList<>();
    ArrayList <Socio> listaSocios = new ArrayList<>();
    // Scanner
    Scanner input = new Scanner(System.in);
    // Socio (para saber quien hace la compra)
    Socio socio;
    
    // Contructor
    public Biblioteca(){
        
    }
    
    // Métodos
    public void registrarSocio(){
        // Creación de nuevo Socio
        Socio socio = new Socio();
        socio.capturar();
        listaSocios.add(socio);
        System.out.println("[SERVER]: Nuevo socio creado exitosamente.");
    }
    
    public void listarSocio(){
        System.out.println("------------SOCIOS------------");
        // Imprime toda la lista de Socios
        for(Socio s: listaSocios){
            System.out.println(s.toString());
            System.out.println("Libros: ");
            s.listarLibros();
            System.out.println("Revistas: ");
            s.listarRevistas();
            System.out.println("********************************");
        }
        System.out.println("------------SOCIOS------------");
    }
    
    public void registrarMaterial() throws InputMismatchException{
        int op;
        System.out.println("------------REGISTRAR MATERIAL------------");
        
        System.out.print("""
                           1. Libro
                           2. Revista
                           Opción: """);
        try{
            op = input.nextInt();
            
            // Limpiamos el buffer
            input.nextLine();
            
            switch(op){
                // Creación de libro o Revista
                case 1:
                    String titulo, autores;
                    System.out.println("\t--Libro--");
                    System.out.print("Título: ");
                    titulo = input.nextLine();
                    System.out.print("Autor: ");
                    autores = input.nextLine();
                    // Agregamos nuevo Libro a su lista
                    listaLibros.add(new Libro(titulo, autores));                    
                    System.out.println("[SERVER]: Libro añadido exitosamente.");
                    break;
                    
                case 2:
                    String titulo2, idioma, frecPublicacion, tipoPublico;
                    System.out.println("\t--Revista--");
                    System.out.print("Título: ");
                    titulo2 = input.nextLine();
                    System.out.print("Idioma: ");
                    idioma = input.nextLine();
                    System.out.print("Frecuancia de publicación (Semanal, Mensual, Anual): ");
                    frecPublicacion = input.nextLine();
                    System.out.print("Público (Infantíl, Científico, etc): ");
                    tipoPublico = input.nextLine();
                    // Agregamos nueva Revista a su lista
                    listaRevista.add(new Revista(titulo2, idioma, frecPublicacion, tipoPublico));                    
                    System.out.println("[SERVER]: Revista añadida exitosamente.");
                    break;
                    
                default:
                    System.out.println("---------------------------------");
                    System.out.println("\tFuera de rango.");
                    System.out.println("---------------------------------");
                    break;
                    
            }
        } catch(IncompatibleClassChangeError intError){
            System.out.println("---------------------------------");
            System.out.println("La opción debe ser un número entero.");
            System.out.println("[ERROR]: " + intError);
            System.out.println("---------------------------------");
        }
        
        System.out.println("------------REGISTRAR MATERIAL------------");
    }
    
    public void listarMaterial() throws InputMismatchException{
        int op;
        System.out.println("------------LISTAR MATERIAL------------");
        System.out.print("""
                           1. Libro
                           2. Revista
                           Opción: """);
        try{
            op = input.nextInt();
            
            // Limpiamos el buffer
            input.nextLine();

            switch(op){
                // Imprimimos todos los materiales dependiendo de la opción
                case 1:
                    for(Libro l: listaLibros){
                        System.out.println(l.toString());
                    }
                    break;

                case 2:
                    for(Revista r: listaRevista){
                        System.out.println(r.toString());
                    }
                    break;

                default:
                    System.out.println("---------------------------------");
                    System.out.println("\tFuera de rango.");
                    System.out.println("---------------------------------");
                    break;
            }
        }catch(IncompatibleClassChangeError intError){
            System.out.println("---------------------------------");
            System.out.println("La opción debe ser un número entero.");
            System.out.println("[ERROR]: " + intError);
            System.out.println("---------------------------------");
        }
        System.out.println("------------LISTAR MATERIAL------------");
    }
    
    public void buscarMaterial() throws InputMismatchException{
        int op;
        System.out.println("------------BUSCAR MATERIAL------------");
        System.out.println("""
                           1. Libro
                           2. Revista
                           """);
        try{
            op = input.nextInt();
            
            // Limpiamos el buffer
            input.nextLine();
            
            String titulo;
            System.out.print("Buscar por nombre: ");
            titulo = input.nextLine();
            
            switch(op){
                // Busca el libro/revista en la lista
                case 1:
                    for(Libro l: listaLibros){
                        if(l.getTitulo().equals(titulo)){
                            System.out.println(l.toString());
                        }
                    }
                    break;
                    
                case 2:
                    for(Revista r: listaRevista){
                        if(r.getTitulo().equals(titulo)){
                            System.out.println(r.toString());
                        }
                    }
                    break;
                    
                default:
                    System.out.println("---------------------------------");
                    System.out.println("\tFuera de rango.");
                    System.out.println("---------------------------------");
                    break;
            }
        } catch(IncompatibleClassChangeError intError){
            System.out.println("---------------------------------");
            System.out.println("La opción debe ser un número entero.");
            System.out.println("[ERROR]: " + intError);
            System.out.println("---------------------------------");
        }
        System.out.println("------------BUSCAR MATERIAL------------");
    }
    
    public void registrarPrestamo(Socio socio) throws InputMismatchException{
        int op;
        System.out.println("------------REGISTRAR PRESTAMO------------");
        System.out.println("""
                           1. Libro
                           2. Revista
                           """);
        try{
            op = input.nextInt();
            
            // Limpiamos el buffer
            input.nextLine();
            
            String titulo;
            System.out.print("Registrar por nombre: ");
            titulo = input.nextLine();
            
            switch(op){
                // Registramos un prestamo a un Socio
                case 1:
                    for(Libro l: listaLibros){
                        if(l.getTitulo().equals(titulo)){
                            l.setDisponible(false);
                            socio.libroPrestamo(l);
                            System.out.println("Libro prestado exitosamente.");
                        }
                    }
                    break;
                    
                case 2:
                    for(Revista r: listaRevista){
                        if(r.getTitulo().equals(titulo)){
                            r.setDisponible(false);
                            socio.revistaPrestamo(r);
                            System.out.println("Revista prestada exitosamente.");
                        }
                    }
                    break;
                    
                default:
                    System.out.println("---------------------------------");
                    System.out.println("\tFuera de rango.");
                    System.out.println("---------------------------------");
                    break;
            }
        } catch(IncompatibleClassChangeError intError){
            System.out.println("---------------------------------");
            System.out.println("La opción debe ser un número entero.");
            System.out.println("[ERROR]: " + intError);
            System.out.println("---------------------------------");
        }
        System.out.println("------------REGISTRAR PRESTAMO------------");
    }
    
    public void registrarDevolucion(Socio socio) throws InputMismatchException{
        int op;
        System.out.println("------------REGISTRAR DEVOLUCIÓN------------");
        System.out.println("""
                           1. Libro
                           2. Revista
                           """);
        try{
            op = input.nextInt();
            
            // Limpiamos el buffer
            input.nextLine();
            
            String titulo;
            System.out.print("Registrar por nombre: ");
            titulo = input.nextLine();
            
            switch(op){
                // Registramos una devolución de un Socio
                case 1:
                    for(Libro l: listaLibros){
                        if(l.getTitulo().equals(titulo)){
                            l.setDisponible(true);
                            socio.libroDevolucion(l);
                            System.out.println("Libro devuelto exitosamente.");
                        }
                    }
                    break;
                    
                case 2:
                    for(Revista r: listaRevista){
                        if(r.getTitulo().equals(titulo)){
                            r.setDisponible(true);
                            socio.revistaDevolucion(r);
                            System.out.println("Revista devuelta exitosamente.");
                        }
                    }
                    break;
                    
                default:
                    System.out.println("---------------------------------");
                    System.out.println("\tFuera de rango.");
                    System.out.println("---------------------------------");
                    break;
            }
        } catch(IncompatibleClassChangeError intError){
            System.out.println("---------------------------------");
            System.out.println("La opción debe ser un número entero.");
            System.out.println("[ERROR]: " + intError);
            System.out.println("---------------------------------");
        }
        System.out.println("------------REGISTRAR DEVOLUCIÓN------------");
    }
    
    public void Salir(){
        System.out.println("---------------------------------");
        System.out.println("[SERVER]: Programa terminado.");
        System.out.println("---------------------------------");
    }
    
    // Iniciar como Socio
    public Socio socio(){
        String nombre;
        System.out.print("Iniciar como Socio: ");
        nombre = input.nextLine();
        for (Socio s: listaSocios) {
            if (s.getNombre().equals(nombre)) 
            {
                System.out.println("Iniciado como \"" + nombre + "\"");
                socio=s;
            }
        }
        return socio;
    }
}