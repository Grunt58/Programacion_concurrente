package poo_motor_practica11;
import javax.swing.JOptionPane;
import java.util.ArrayList;
/*
 *
 * @author Jorge Tirado Uriza
 */
public class Taller {
    // ArrayList Para los 3 tipos de motores
    ArrayList<Electrico> mElectricos = new ArrayList<>();
    ArrayList<Explosion> mExplosion = new ArrayList<>();
    ArrayList<Vapor> mVapor = new ArrayList<>();
    
    // Atributos
    private int motores = 0;
    // Para el número de mototres diagnosticas usaré el tamaño de las listas
    
    // Constructores
    public Taller() {
            
    }

    // Métodos
    public void recibirMotor(Motor motor){
        if(motor instanceof Motor){
            if(motor instanceof Electrico electrico){
                System.out.println("[Debug]: Motor <" + motor.getTipo() + "> recibido."); // Ingorar
                JOptionPane.showMessageDialog(null, "Motor " + motor.getTipo() + " recibido.", "Taller", 1);
                mElectricos.add(electrico);
                diagnosticar(electrico);
                motores++;
            } else if(motor instanceof Explosion explosion){
                System.out.println("[Debug]: Motor <" + motor.getTipo() + "> recibido."); // Ingorar
                JOptionPane.showMessageDialog(null, "Motor " + motor.getTipo() + " recibido.", "Taller", 1);
                mExplosion.add(explosion);
                diagnosticar(explosion);
                motores++;
            } else if(motor instanceof Vapor vapor){
                System.out.println("[Debug]: Motor <" + motor.getTipo() + "> recibido."); // Ingorar
                JOptionPane.showMessageDialog(null, "Motor " + motor.getTipo() + " recibido.", "Taller", 1);
                mVapor.add(vapor);
                diagnosticar(vapor);
                motores++;
            } else {
                System.out.println("[Debug]: Motor desconocido. (rechazado)"); // Ingorar
                JOptionPane.showMessageDialog(null, "Motor desconocido. (rechazado)", "Taller", 0);
            }
        } else {
            System.out.println("[Debug]: Esto no es un motor. (rechazado)"); // Ingorar
            JOptionPane.showMessageDialog(null, "Esto no es un motor. (rechazado)", "Taller", 0);
        }
    }
    
    // Identificará la falla del motor dado
    private void diagnosticar(Motor motor){
        int opcion = JOptionPane.showOptionDialog(null, "Seleccione la posible falla", "Diagnóstico | Taller", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, motor.fallas, motor.fallas);
        JOptionPane.showMessageDialog(null, motor.toString()+"\n\n\nFalla en: "+motor.fallas[opcion], "Diagnóstico | Taller", 1);
    }

    public void infoTaller(){
        JOptionPane.showMessageDialog(null,
                motores+" de vehículos ingreados:"
                +"\n\n"+mElectricos.size()+" vehículos-eléctricos diagnosticados"
                +"\n"+mExplosion.size()+" vehículos-mecánicos diagnosticados"
                +"\n"+mVapor.size()+" vehículos-térmicos diagnosticados", "Taller", 1);
    }
    
}
