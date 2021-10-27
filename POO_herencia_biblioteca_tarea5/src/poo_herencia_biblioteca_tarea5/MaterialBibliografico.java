package poo_herencia_biblioteca_tarea5;
import java.util.Random;
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
public class MaterialBibliografico {
    // Atributos
    protected String ISBN="", titulo, estado;
    // Prestado = false; Devuelto = true
    protected Boolean disponible;
    protected Double diasMulta = 5.0;
    // Objeto Random
    Random n = new Random();
    // Objeto Scanner
    Scanner input = new Scanner(System.in);
    
    // Constructor
    public MaterialBibliografico(String titulo){
        // Generamos un ISBN aleatorio con Random y lo concatenamos
        for(int i=1; i<=10; i++){
            ISBN += n.nextInt(10);
        }
        this.titulo = titulo;
        disponible = true;
        estado = "Disponible";
    }
    
    // Getters y Setters

    public String getISBN() {
        return ISBN;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEstado() {
        return estado;
    }

    public Boolean getDisponible() {
        return disponible;
    }
    
    // Cambiar disponibilidad
    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
        if(disponible){
            this.estado = "Disponible";
        } else {
            this.estado = "Prestado";
        }
    }

    public Double getDiasMulta() {
        return diasMulta;
    }

    public void setDiasMulta(Double diasMulta) {
        this.diasMulta = diasMulta;
    }
    
    

    @Override
    public String toString() {
        return "MaterialBibliografico{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", estado=" + estado + '}';
    }
}
