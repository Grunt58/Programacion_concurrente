package poo_motor_practica11;
import java.util.Random;
/*
 *
 * @author null
 */
public class Motor {
    // Atributos
    protected int torque, velocidadGiro;
    protected String tipo;
    protected String[] fallas = {};
    // Objeto Random
    Random n = new Random();
    
    // Constructores
    public Motor() {
        torque = n.nextInt(100);
        velocidadGiro = n.nextInt(100);
    }
    
    // Getters y Setters
    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public int getVelocidadGiro() {
        return velocidadGiro;
    }

    public void setVelocidadGiro(int velocidadGiro) {
        this.velocidadGiro = velocidadGiro;
    }

    public String getTipo() {
        return tipo;
    }
    
    // Métodos
    public void capturarDatos(){
        
    }
        
    // toString
    @Override
    public String toString() {
        return "Motor{" + "torque=" + torque + ", velocidadGiro=" + velocidadGiro + '}';
    }
}
