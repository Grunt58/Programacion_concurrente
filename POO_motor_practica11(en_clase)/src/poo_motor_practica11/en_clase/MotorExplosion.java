package poo_motor_practica11.en_clase;

import javax.swing.JOptionPane;

/**
 *
 * @author Jorge Tirado Uriza
 */
public class MotorExplosion extends Motor{
    private int cilindros, eficianciaTermica;
    private String tipoCombustible;
    protected String[] combustibles={
        "Gasolina",
        "Diesel"
    };

    public MotorExplosion() {
        this.fallas = new String[]{
            "Torque",
            "Velocidad de giro",
            "Cilindors",
            "Eficacia Térmica",
            "Tipo de combustible"
        };
    }
    
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
        
        while(true){
            cilindros = Integer.parseInt(JOptionPane.showInputDialog(null, "Cilindros (2-8):", "Tirado, Información del motor", JOptionPane.QUESTION_MESSAGE));
            if(cilindros < 2 || cilindros > 8){
                JOptionPane.showMessageDialog(null, "Los cilindros no debe ser menor a 2 o mayor a 8", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                break;
            }
        }
        
        while(true){
            eficianciaTermica = Integer.parseInt(JOptionPane.showInputDialog(null, "Eficacia térmica (40-60%):", "Tirado, Información del motor", JOptionPane.QUESTION_MESSAGE));
            if(eficianciaTermica < 40 || eficianciaTermica > 60){
                JOptionPane.showMessageDialog(null, "La eficiencia térmica no debe ser menor a 40 o mayor a 60", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                break;
            }
        }
        
        tipoCombustible = (String)JOptionPane.showInputDialog(null, "Tirado, Selecciona combustible:", "Combustibles", JOptionPane.DEFAULT_OPTION, null, combustibles, combustibles[0]);
        
    }

    @Override
    public String toString() {
        return "----------------------------"
               + "\nMotor: Explosión" 
               + super.toString()
               + "\nCilindros: " + cilindros
               + "\nEficiencia Térmica: " + eficianciaTermica + "%"
               + "\nTipo de combustible: " + tipoCombustible
               + "\n----------------------------";
    }
    
    @Override
    public void listarInformacion(){
        JOptionPane.showMessageDialog(null, toString(), "Tirado, motor", JOptionPane.DEFAULT_OPTION);
    }
    
    @Override
    public String seleccionaFalla(){
        String respuesta = (String)JOptionPane.showInputDialog(null, "Tirado, Selecciona falla:", "Fallas (Explosión)", JOptionPane.DEFAULT_OPTION, null, fallas, fallas[0]);
        return respuesta;
    }
}
