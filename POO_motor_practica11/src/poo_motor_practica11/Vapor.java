package poo_motor_practica11;
import java.util.Random;

/*
 *
 * @author null
 */
public class Vapor extends Motor{
    // Atributos
    protected int presionTrabajo, temperaturaCaldera;
    protected String tipoCombustible;
    protected String[] combustibles={
        "Alternativo",
        "Rotativo"
    };
    // Objeto Random
    Random n = new Random();
    
    // Constructores
    public Vapor(){
        this.fallas = new String[]{
            "Torque",
            "Velocidad de giro",
            "Presión de Trabajo",
            "Temperatura de Caldera",
            "Tipo de combustible"
        };
        this.tipo = "Vapor";
        presionTrabajo = n.nextInt(100);
        temperaturaCaldera = n.nextInt(100);
        tipoCombustible = combustibles[n.nextInt(2)];
    }
    
    // Getters y Setters
    public int getPresionTrabajo() {
        return presionTrabajo;
    }

    public void setPresionTrabajo(int presionTrabajo) {
        this.presionTrabajo = presionTrabajo;
    }

    public int getTemperaturaCaldera() {
        return temperaturaCaldera;
    }

    public void setTemperaturaCaldera(int temperaturaCaldera) {
        this.temperaturaCaldera = temperaturaCaldera;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    
    // Métodos
    @Override
    public void capturarDatos(){
        
    }
    
    // toString
    @Override
    public String toString() {
        return "Tipo: "+tipo
               +"\nTorque: "+torque
               +"\nVelocidad de giro: "+velocidadGiro
               +"\nPresión de Trabajo: "+presionTrabajo
               +"\nTemperatura de Caldera: "+temperaturaCaldera
               +"\nTipo de combustible: "+tipoCombustible;
    }
}
