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
public class Revista extends MaterialBibliografico{
    // Atributos
    protected String idioma, frecPublicacion, tipoPublico;
    
    // Constuctor (registrar Revista)
    public Revista(String titulo, String idioma, String frecPublicacion, String tipoPublico) {
        super(titulo);
        this.idioma = idioma;
        this.frecPublicacion = frecPublicacion;
        this.tipoPublico = tipoPublico;
    }
    
    // Getters y Setters
    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getFrecPublicacion() {
        return frecPublicacion;
    }

    public void setFrecPublicacion(String frecPublicacion) {
        this.frecPublicacion = frecPublicacion;
    }

    public String getTipoPublico() {
        return tipoPublico;
    }

    public void setTipoPublico(String tipoPublico) {
        this.tipoPublico = tipoPublico;
    }
    
    // Listar Revista
    @Override
    public String toString() {
        return "++++++++++++++++++++++++++++++++++++"
                +"\nRevista"
                +"\nTítulo: " + getTitulo()
                +"\nFrecuencia de publicación: " + getFrecPublicacion()
                +"\nTipo de público: " + getTipoPublico()
                +"\nISBN: " + getISBN()
                +"\nEstado: " + getEstado();
    }
}
