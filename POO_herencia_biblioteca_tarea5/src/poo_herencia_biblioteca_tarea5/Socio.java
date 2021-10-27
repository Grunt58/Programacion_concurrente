package poo_herencia_biblioteca_tarea5;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
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
public class Socio {
    // Array para prestamos
    ArrayList<Libro> libroPrestamos = new ArrayList<>();
    ArrayList<Revista> revistaPrestamos = new ArrayList<>();
    // Random (para determinar cuando fue devuelto el libro/revista de forma aleatoria)
    Random n = new Random();
    
    // Atributos
    protected String nombre, materialPrestamo;
    protected Direccion direccion;
    protected int telefono, multas=0, diasDevuelto, diasTarde;
    public Scanner input;
    
    // Constructor
    public Socio() {
        direccion = new Direccion(); // Relación de composición
        this.input = new Scanner(System.in);
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMaterialPrestamo() {
        return materialPrestamo;
    }

    public void setMaterialPrestamo(String materialPrestamo) {
        this.materialPrestamo = materialPrestamo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public double getMultas() {
        return multas;
    }

    public void setMultas(int multas) {
        this.multas = multas;
    }

    public double getDiasDevuelto() {
        return diasDevuelto;
    }

    public void setDiasDevuelto(int diasDevuelto) {
        this.diasDevuelto = diasDevuelto;
    }

    public int getDiasTarde() {
        return diasTarde;
    }

    public void setDiasTarde(int diasTarde) {
        this.diasTarde = diasTarde;
    }    
    
    // Listar Socio
    @Override
    public String toString() {
        return "********************************"
                +"\nSOCIO"
                +"\nNombre: " + getNombre()
                +"\nTeléfono: " + getTelefono()
                +"\n" + direccion.toString()
                +"\nMultas: " + getMultas();
    }
    
    // Métodos
    public void capturar(){
        System.out.println("...............................");
        System.out.print("Nombre: ");
        nombre = input.nextLine();
        System.out.print("Teléfono: ");
        telefono = input.nextInt();
        System.out.print("-Dirección:");
        input.nextLine();
        direccion.capturarDireccion();
    }
    
    public void libroPrestamo(Libro material){
        libroPrestamos.add(material);
    }
    
    public void revistaPrestamo(Revista material){
        revistaPrestamos.add(material);
    }
    
    public void libroDevolucion(Libro material){
        libroPrestamos.remove(material);
        setDiasDevuelto(n.nextInt(11));
        // Determinamos el tiempo que tardó en devolverlo
        setDiasTarde((int) (getDiasDevuelto() - material.getDiasMulta()));
        if(getDiasDevuelto() > material.getDiasMulta()){
            System.out.println("Libro: \"" + material.getTitulo() + "\" fue devuelto \"" + getDiasTarde() + "\" días tarde. 1+Multa");
            multas++;
        }
        
    }
    
    public void revistaDevolucion(Revista material){
        revistaPrestamos.remove(material);
        setDiasDevuelto(n.nextInt(11));
        // Determinamos el tiempo que tardó en devolverlo
        setDiasTarde((int) (getDiasDevuelto() - material.getDiasMulta()));
        if(getDiasDevuelto() > material.getDiasMulta()){
            System.out.println("Revista: \"" + material.getTitulo() + "\" fue devuelto \"" + getDiasTarde() + "\" días tarde. 1+Multa");
            multas++;
        }
    }
    
    public void listarLibros(){
        if(libroPrestamos.size() > 0){
            for(Libro l: libroPrestamos){
                System.out.println(l.toString()); 
            }
        } else {
            System.out.println("Sin prestamos");
        }
        
    }
    
    public void listarRevistas(){
        if(revistaPrestamos.size() > 0){
            for(Revista r: revistaPrestamos){
                System.out.println(r.toString());
            }
        } else {
            System.out.println("Sin prestamos");
        }
        
    }
}
