package poo_motor_practica11;
import java.util.Random;
/*
 *
 * @author Jorge Tirado Uriza
 */
public class Explosion extends Motor{
    // Atributos
    protected int cilindros, eficianciaTermica;
    protected String tipoCombustible;
    protected String[] combustibles={
        "Gasolina",
        "Diesel"
    };
    // Objeto Random
    Random n = new Random();
    
    
    // Constructores
    public Explosion(){
        this.fallas = new String[]{
            "Torque",
            "Velocidad de giro",
            "Cilindors",
            "Eficacia Térmica",
            "Tipo de combustible"
        };
        this.tipo = "Explosión";
        cilindros = n.nextInt(100);
        eficianciaTermica = n.nextInt(100);
        tipoCombustible = combustibles[n.nextInt(2)];
    }
    
    // Getters y Setters
    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public int getEficianciaTermica() {
        return eficianciaTermica;
    }

    public void setEficianciaTermica(int eficianciaTermica) {
        this.eficianciaTermica = eficianciaTermica;
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
               +"\nCilindors: "+cilindros
               +"\nEficacia Térmica: "+eficianciaTermica
               +"\nTipo de combustible: "+tipoCombustible;
    }
}
