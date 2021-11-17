package poo_motor_practica11.en_clase;

import javax.swing.JOptionPane;

/**
 *
 * @author Jorge Tirado Uriza
 */
public class MotorVapor extends Motor{
    private int presionTrabajo, temperaturaCaldera;
    private String tipoCombustible;

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

    @Override
    public void capturarDatos(){
        super.capturarDatos();
        
        presionTrabajo = Integer.parseInt(JOptionPane.showInputDialog(null, "Presión de trabajo:", "Tirado, Información del motor", JOptionPane.QUESTION_MESSAGE));
        
        temperaturaCaldera = Integer.parseInt(JOptionPane.showInputDialog(null, "Temperatura de caldera:", "Tirado, Información del motor", JOptionPane.QUESTION_MESSAGE));
        
        tipoCombustible = JOptionPane.showInputDialog(null, "Combustible:", "Tirado, Información del motor", JOptionPane.QUESTION_MESSAGE);
    }
    
    @Override
    public String toString() {
        return "MotorVapor" +super.toString()+ "\npresionTrabajo=" + presionTrabajo + "\ntemperaturaCaldera=" + temperaturaCaldera + "\ntipoCombustible=" + tipoCombustible;
    }
    
    @Override
    public void listarInformacion(){
        JOptionPane.showMessageDialog(null, toString(), "Tirado, motor", JOptionPane.DEFAULT_OPTION);
    }            
    
}
