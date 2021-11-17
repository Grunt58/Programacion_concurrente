package poo_motor_practica11.en_clase;

/**
 *
 * @author null
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Taller taller = new Taller();
        MotorElectrico mElectrico = new MotorElectrico();
        MotorExplosion mExplosion = new MotorExplosion();
        MotorVapor mVapor = new MotorVapor();
        
        taller.recibirMotor(mElectrico);
    }
    
}
