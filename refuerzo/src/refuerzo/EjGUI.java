package refuerzo;
import javax.swing.JFrame;

/**
 *
 * @author GAMER
 */
public class EjGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame v = new JFrame();
        v.setBounds(100, 100, 400, 400);
        v.setTitle("Mi objeto");
        v.setResizable(false);
        v.setVisible(true);
        
        detalle v2[];
        v2 = new detalle[5];
        for(int i=0; i<5; i++){
            v2[i]=new detalle();
            v2[i].setTitle("Ventana "+(i+1));
            v2[i].setLocation(900, 200+(i*50));
            v2[i].setVisible(true);
        }
    }
}
