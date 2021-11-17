package poo_motor_practica11.en_clase;

import javax.swing.JOptionPane;

/**
 *
 * @author Jorge Tirado Uriza
 */
public class MotorExplosion extends Motor{
    private int cilindros, eficianciaTermica;
    private String tipoCombustible;

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
    
    @Override
    public void capturarDatos(){
        super.capturarDatos();
        
        cilindros = Integer.parseInt(JOptionPane.showInputDialog(null, "Cilindros:", "Tirado, Información del motor", JOptionPane.QUESTION_MESSAGE));
        
        eficianciaTermica = Integer.parseInt(JOptionPane.showInputDialog(null, "Eficacia térmica:", "Tirado, Información del motor", JOptionPane.QUESTION_MESSAGE));
        
        tipoCombustible = JOptionPane.showInputDialog(null, "Combustible:", "Tirado, Información del motor", JOptionPane.QUESTION_MESSAGE);
    }

    @Override
    public String toString() {
        return "MotorExplosion" +super.toString()+ "\ncilindros=" + cilindros + "\neficianciaTermica=" + eficianciaTermica + "\ntipoCombustible=" + tipoCombustible;
    }
    
    @Override
    public void listarInformacion(){
        JOptionPane.showMessageDialog(null, toString(), "Tirado, motor", JOptionPane.DEFAULT_OPTION);
    }
    
    @Override
    public String seleccionaFalla(){
        String [] fallas = {"torque", "Velocidad de Giro", "Cilindros", "Eficiencia", "Combustible"};
        String respuesta = (String)JOptionPane.showInputDialog(null, "Tirado, Selecciona falla:", "Fallas", JOptionPane.DEFAULT_OPTION, null, fallas, fallas[0]);
        return respuesta;
    }
}
