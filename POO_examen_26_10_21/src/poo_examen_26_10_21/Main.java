package poo_examen_26_10_21;
import java.util.Random;

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
        Guerrero g = new Guerrero("Carlos", 50, 15, "Espada");
        Mago m = new Mago("Victor", 40, 10, "Fuego");
        Random rand = new Random();
        int batallas = 1;
        
        System.out.println(g.toString());
        System.out.println(m.toString());
        
        do{
            System.out.println("Batalla " + batallas);
            g.alimentarse(30);
            m.alimentarse(50);
            
            g.combatir(rand.nextInt(40));
            m.encantar(rand.nextInt(60));
            
            /*
            g.atacar(m);
            m.atacar(g);
            
            if(g.getVida() <= 0 || g.getEnergia() <= 0){
                System.out.println("Mago " + m.getNombre() + " gano");
            } else if(m.getVida() <= 0 || m.getEnergia() <= 0){
                System.out.println("Guerrero " + g.getNombre() + " gano");
            }
*/
            
            batallas++;
        }while(batallas <= 3);
        //}while(g.getVida() >= 0 || g.getEnergia() >= 0 || m.getVida() >= 0 || m.getEnergia() >= 0);
        if(g.getEnergia() < m.getEnergia()){
                System.out.println("El mago " + m.getNombre() + " gano");
        }else{
                System.out.println("El guerrero " + g.getNombre() + " gano");
        }
        System.out.println(g.toString());
        System.out.println(m.toString());
        
    }
}