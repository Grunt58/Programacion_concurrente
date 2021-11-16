package poo_motor_practica11;
import java.util.Random;
/*
 *
 * @author Jorge Tirado Uriza
 */
public class Electrico extends Motor{
    // Atributos
    protected int voltaje, corriente, numeroDevandados;
    // Objeto Random
    Random n = new Random();
    
    // Constructores
    public Electrico() {
        this.fallas = new String[]{
            "Torque",
            "Velocidad de giro",
            "Voltaje",
            "Corriente",
            "Número de vandados"
        };
        this.tipo = "Eléctrico";
        voltaje = n.nextInt(100);
        corriente = n.nextInt(100);
        numeroDevandados = n.nextInt(100);
    }
    

    // Getters y Setters
    public int getVoltaje(){
        return voltaje;
    }
    
    public void setVoltaje(int voltaje) {    
        this.voltaje = voltaje;
    }

    public int getCorriente() {
        return corriente;
    }

    public void setCorriente(int corriente) {
        this.corriente = corriente;
    }

    public int getNumeroDevandados() {
        return numeroDevandados;
    }
    
    public void setNumeroDevandados(int numeroDevandados) {
        this.numeroDevandados = numeroDevandados;
    }

    // Métodos
    @Override
    public void capturarDatos() {
        
    }
    
    // toString
    @Override
    public String toString() {
        return "Tipo: "+tipo
               +"\nTorque: "+torque
               +"\nVelocidad de giro: "+velocidadGiro
               +"\nVoltaje: "+voltaje
               +"\nCorriente: "+corriente
               +"\nNúmero de vandados: "+numeroDevandados;
    }    
}
