package poo_motor_practica11.en_clase;

import javax.swing.JOptionPane;
/**
 *
 * @author Jorge Tirado Uriza
 */
public class Motor {
    protected int torque, velocidadGiro;
    protected String[] fallas = {};
    
    public void capturarDatos(){
        while(true){
            torque = Integer.parseInt(JOptionPane.showInputDialog(null, "Torque (Par máximo <79>):", "Tirado, Información del motor", JOptionPane.QUESTION_MESSAGE));
            if(torque < 1 || torque > 79){
                JOptionPane.showMessageDialog(null, "El torque no debe ser menor a 0 o mayor a 79", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                break;
            }
        }
        while(true){
            velocidadGiro = Integer.parseInt(JOptionPane.showInputDialog(null, "Velocidad (1,800 - 20,000 RPM):", "Tirado, Información del motor", JOptionPane.QUESTION_MESSAGE));
            if(velocidadGiro < 1800 || velocidadGiro > 20000){
                JOptionPane.showMessageDialog(null, "La velocidad de giro no debe ser menor a 1,8000 o mayor a 20,000", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                break;
            }
        }
            
        
        
    }

    @Override
    public String toString() {
        return "\nTorque: " + torque + " NM"
               + "\nVelocidad de giro: " + velocidadGiro + " RPM";
    }
    
    public void listarInformacion(){
        JOptionPane.showMessageDialog(null, toString(), "Tirado, motor", JOptionPane.DEFAULT_OPTION);
    }
    
    public String seleccionaFalla(){
        return "";
    }
}
