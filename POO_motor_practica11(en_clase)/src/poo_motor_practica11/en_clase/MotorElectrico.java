package poo_motor_practica11.en_clase;

import javax.swing.JOptionPane;

/**
 *
 * @author Jorge Tirado Uriza
 */
public class MotorElectrico extends Motor{
    private int voltaje, corriente, numeroDevandados;

    public MotorElectrico() {
        this.fallas = new String[]{
            "Torque",
            "Velocidad de giro",
            "Voltaje",
            "Corriente",
            "Número de devandados"
        };
    }
    
    public int getVoltaje() {
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
    
    @Override
    public void capturarDatos(){
        super.capturarDatos();
        while(true){
            voltaje = Integer.parseInt(JOptionPane.showInputDialog(null, "Voltaje (120V o 240V):", "Tirado, Información del motor", JOptionPane.QUESTION_MESSAGE)); 
            if(voltaje < 120 || voltaje > 240){
                 JOptionPane.showMessageDialog(null, "El voltaje no debe ser menor a 120V o mayor a 240V", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                break;
            }
        }
        
        while(true){
            corriente = Integer.parseInt(JOptionPane.showInputDialog(null, "Corriente (1-8 Amperes):", "Tirado, Información del motor", JOptionPane.QUESTION_MESSAGE));
            if(corriente < 1 || corriente > 8){
                JOptionPane.showMessageDialog(null, "La corriente no debe ser menor a 1 o mayor a 8", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                break;
            }
        }
        
        while(true){
            numeroDevandados = Integer.parseInt(JOptionPane.showInputDialog(null, "Número de devanados (8-12):", "Tirado, Información del motor", JOptionPane.QUESTION_MESSAGE));
            if(numeroDevandados < 8 || numeroDevandados > 12){
                JOptionPane.showMessageDialog(null, "El número de devanados no debe ser menor a 8 o mayor a 12", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "----------------------------"
                + "\nMotor: Electrico"
                + super.toString()
                + "\nVoltaje: " + voltaje + "V"
                + "\nCorriente: " + corriente + " Amperes"
                + "\nNúmero de devanados: " + numeroDevandados
                + "\n----------------------------";
    }
    
    @Override
    public void listarInformacion(){
        JOptionPane.showMessageDialog(null, toString(), "Tirado, motor", JOptionPane.DEFAULT_OPTION);
    }
    
    @Override
    public String seleccionaFalla(){
        String respuesta = (String)JOptionPane.showInputDialog(null, "Tirado, Selecciona falla:", "Fallas (Eléctrico)", JOptionPane.DEFAULT_OPTION, null, fallas, fallas[0]);
        return respuesta;
    }
}
