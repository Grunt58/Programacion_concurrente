package poo_motor_practica11.en_clase;

import javax.swing.JOptionPane;

/**
 *
 * @author Jorge Tirado Uriza
 */
public class MotorVapor extends Motor{
    private int presionTrabajo, temperaturaCaldera;
    private String tipoCombustible;
    protected String[] combustibles={
        "Alternativo",
        "Rotativo"
    };

    public MotorVapor() {
        this.fallas = new String[]{
            "Torque",
            "Velocidad de giro",
            "Presión de Trabajo",
            "Temperatura de Caldera",
            "Tipo de combustible"
        };
    }
    
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
        
        while(true){
            temperaturaCaldera = Integer.parseInt(JOptionPane.showInputDialog(null, "Temperatura de caldera (120-200C°):", "Tirado, Información del motor", JOptionPane.QUESTION_MESSAGE));
            if(temperaturaCaldera < 120 || temperaturaCaldera > 240){
                JOptionPane.showMessageDialog(null, "La temperatura de caldera no debe ser menor a 120 o mayor a 200", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                break;
            }
        }
        
        tipoCombustible = (String)JOptionPane.showInputDialog(null, "Tirado, Selecciona combustible:", "Combustible", JOptionPane.DEFAULT_OPTION, null, combustibles, combustibles[0]);
    }
    
    @Override
    public String toString() {
        return "----------------------------"
               + "\nMotor: \"Vapor\""
               + super.toString()
               + "\nPresión de trabajo: " + presionTrabajo
               + "\nTemperatura de caldera: " + temperaturaCaldera + "Grados Celsius"
               + "\nTipo de combustible: " + tipoCombustible
               + "\n----------------------------";
    }
    
    @Override
    public void listarInformacion(){
        JOptionPane.showMessageDialog(null, toString(), "Tirado, motor", JOptionPane.DEFAULT_OPTION);
    }
    
    @Override
    public String seleccionaFalla(){
        String respuesta = (String)JOptionPane.showInputDialog(null, "Tirado, Selecciona falla:", "Fallas (Vapor)", JOptionPane.DEFAULT_OPTION, null, fallas, fallas[0]);
        return respuesta;
    }   
}