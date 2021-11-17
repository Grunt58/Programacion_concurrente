package poo_motor_practica11.en_clase;

import javax.swing.JOptionPane;

/**
 *
 * @author Jorge Tirado Uriza
 */
public class MotorElectrico extends Motor{
    private int voltaje, corriente, numeroDevandados;

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
        
        voltaje = Integer.parseInt(JOptionPane.showInputDialog(null, "Voltaje:", "Tirado, Información del motor", JOptionPane.QUESTION_MESSAGE));
        
        corriente = Integer.parseInt(JOptionPane.showInputDialog(null, "Corriente:", "Tirado, Información del motor", JOptionPane.QUESTION_MESSAGE));
        
        numeroDevandados = Integer.parseInt(JOptionPane.showInputDialog(null, "Número de vanados:", "Tirado, Información del motor", JOptionPane.QUESTION_MESSAGE));
    }

    @Override
    public String toString() {
        return "MotorElectrico" +super.toString()+ "\nvoltaje=" + voltaje + "\ncorriente=" + corriente + "\nnumeroDevandados=" + numeroDevandados;
    }
    
    @Override
    public void listarInformacion(){
        JOptionPane.showMessageDialog(null, toString(), "Tirado, motor", JOptionPane.DEFAULT_OPTION);
    }
}
