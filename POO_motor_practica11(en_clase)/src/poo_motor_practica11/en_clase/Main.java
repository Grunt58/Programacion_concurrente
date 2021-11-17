package poo_motor_practica11.en_clase;

/**
 *
 * @author Jorge Tirado Uriza
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
        
        mElectrico.capturarDatos();
        System.out.println(mElectrico.toString());
        mElectrico.listarInformacion();
        
        mExplosion.capturarDatos();
        System.out.println(mExplosion.toString());
        mExplosion.listarInformacion();
        
        mVapor.capturarDatos();
        System.out.println(mVapor.toString());
        mVapor.listarInformacion();
        
        taller.recibirMotor(mElectrico);
        taller.recibirMotor(mExplosion);
        taller.recibirMotor(mVapor);
        
        taller.diagnosticar(mElectrico);
        taller.diagnosticar(mExplosion);
        taller.diagnosticar(mVapor);
    }
    
}
