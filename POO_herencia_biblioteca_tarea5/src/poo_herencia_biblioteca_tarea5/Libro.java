package poo_herencia_biblioteca_tarea5;

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
public class Libro extends MaterialBibliografico{
    // Atributos
    protected String autores;
    
    // Constructor (registrar Libro)
    public Libro(String titulo, String autores){
        super(titulo);
        this.autores = autores;
    }

    // Getters y Setters
    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    // Listar Libro
    @Override
    public String toString() {
        return "++++++++++++++++++++++++++++++++++++"
                +"\nLibro"
                +"\nTítulo: " + getTitulo()
                +"\nAutor(es): " + getAutores()
                +"\nISBN: " + getISBN()
                +"\nEstado: " + getEstado()
                +"\n++++++++++++++++++++++++++++++++++++";
    }
}
