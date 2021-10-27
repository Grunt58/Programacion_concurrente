package poo_examen_26_10_21;
import java.util.Random;

/**
 *
 * @author null
 */

public class Personaje {
    // Atributos
    protected String nombre;
    protected int energia, energiaQueGasta, energiaA, vida, danio;
    // Random es para generar un número entero aleatorio
    Random rand = new Random();
    
    // Contructor
    public Personaje(String nombre, int energia, int energiaQueGasta) {
        this.nombre = nombre;
        this.energia = energia;
        this.energiaQueGasta = energiaQueGasta;
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getEnergiaQueGasta() {
        return energiaQueGasta;
    }

    public void setEnergiaQueGasta(int energiaQueGasta) {
        this.energiaQueGasta = energiaQueGasta;
    }

    public int getEnergiaA() {
        return energiaA;
    }

    public void setEnergiaA(int energiaA) {
        this.energiaA = energiaA;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDanio() {
        return danio;
    }

    public void setDanio(int danio) {
        this.danio = danio;
    }
    
    
    
    // Métodos
    public void alimentarse(int energiaNueva){
        setEnergiaA(energia);
        setEnergia(energia + energiaNueva);
    }
    
/*
    public void atacar(Object a){
        // el 1+ es porque genera un número entre 0-99 (100)
        danio = 1+rand.nextInt(100);
        setDanio(danio);
        
        // if-elseif para verificar el daño
        if(danio >= 1 && danio <= 49){
            System.out.println("No se lastimo al contrincante");
        } else if(danio >= 50 && danio <= 70){
            System.out.println("Se lastimo levemente al contrincante y pierde 10 puntos de vida");
            setVida(vida - 10);
        } else if(danio >= 71 && danio <= 89){
            System.out.println("Se lastimo al contrincante y pierde 20 puntos de vida");
            setVida(vida - 20);
        } else if(danio >= 90 && danio <= 100){
            System.out.println("Se lastimo fuertemente al contrincante y pierde 30 puntos de vida");
        }
    }
*/

    @Override
    public String toString() {
        return "\n++++++++++++++++++++++++++"
                +"\nNombre: " + getNombre()
                +"\nEnergía: " + getEnergia();
    }
}