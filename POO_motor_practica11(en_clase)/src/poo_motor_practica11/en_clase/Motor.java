package poo_motor_practica11.en_clase;

import javax.swing.JOptionPane;
/**
 *
 * @author Jorge Tirado Uriza
 */
public class Motor {
    protected int torque, velocidadGiro;
    
    public void capturarDatos(){
        torque = Integer.parseInt(JOptionPane.showInputDialog(null, "Torque:", "Tirado, Información del motor", JOptionPane.QUESTION_MESSAGE));
        
        velocidadGiro = Integer.parseInt(JOptionPane.showInputDialog(null, "Velocidad", "Tirado, Información del motor", JOptionPane.QUESTION_MESSAGE));
    }

    @Override
    public String toString() {
        return "\ntorque=" + torque + "\nvelocidadGiro=" + velocidadGiro;
    }
    
    public void listarInformacion(){
        JOptionPane.showMessageDialog(null, toString(), "Tirado, motor", JOptionPane.DEFAULT_OPTION);
    }
    
    public String seleccionaFalla(){
        return "";
    }
}
