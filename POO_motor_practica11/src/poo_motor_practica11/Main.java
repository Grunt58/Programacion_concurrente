package poo_motor_practica11;
import java.util.Random;
/*
 *
 * @author null
 */
public class Main {

    public static void main(String[] args) {
        Taller taller = new Taller();
        Random n = new Random();
        Electrico elc;
        Explosion exp;
        Vapor vp;
        
        int op, maxMotor=0;
        
        do{
            op = n.nextInt(3);
            
            switch(op){
                case 0:
                    elc = new Electrico();
                    taller.recibirMotor(elc);
                    break;
                case 1:
                    exp = new Explosion();
                    taller.recibirMotor(exp);
                    break;
                case 2:
                    vp = new Vapor();
                    taller.recibirMotor(vp);
                    break;
            }
            
            maxMotor++;
        }while(maxMotor<20);
            
        
        taller.infoTaller();
    } 
}
