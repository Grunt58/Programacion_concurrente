package poo_panel_practica10;
import javax.swing.JOptionPane;
/**
 *
 * @author null
 */
public class Main {

    public static void main(String[] args) {
        /*
        // Parte 1
        JOptionPane.showMessageDialog(null, "<apellido>: Este es un mensaje de prueba");
        */
        
        /*
        // Parte 2
        JOptionPane.showMessageDialog(null, "<apellido>: Mensaje con título", "Tipos de mensaje", -1);
        */
        
        /*
        // Parte 3
        String nombre = JOptionPane.showInputDialog("Nombre:");
        JOptionPane.showMessageDialog(null, nombre, "Datos del estudiante", 1);
        */
        
        /*
        // Parte 4
        String nombre = JOptionPane.showInputDialog(null, "Nombre completo", "<nombre>");
        JOptionPane.showMessageDialog(null, nombre);
        */
        
        /*
        // Parte 5
        String num = JOptionPane.showInputDialog("<apellido>: Valor1");
        JOptionPane.showMessageDialog(null, Integer.valueOf(num)+1);
        */
        
        /*
        // Parte 6 y 7
        String[] carreras = {
            "Ingeniería a sistemas computacionales",
            "Ingeniería industrial",
            "Ingeniería en mecatrónica",
            "Ingeniería en informática"
        };
        
        String respuesta = (String)JOptionPane.showInputDialog(null, "<apellido>: Seleccione una carrera a cursar", "Carreras", JOptionPane.DEFAULT_OPTION, null, carreras, carreras[0]);
        int respuesta2 = JOptionPane.showOptionDialog(null, "<apellido>: Seleccione una carrera a cursar", "Carreras", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, carreras, carreras[0]);
        JOptionPane.showMessageDialog(null, "<apellido>: " + carreras[respuesta2]);
        */
        
        /*
        // Parte 8
        String[] opciones = {
            "Yes",
            "No",
            "Cancel"
        };
        
        int op = JOptionPane.showConfirmDialog(null, "<apellido>");
        JOptionPane.showMessageDialog(null, opciones[op]);
        */
    }
}