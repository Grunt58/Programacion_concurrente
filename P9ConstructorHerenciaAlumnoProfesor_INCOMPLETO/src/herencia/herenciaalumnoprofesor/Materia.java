package herencia.herenciaalumnoprofesor;

import java.util.Scanner;
/**
 *
 * @author null
 */

public class Materia {
    private int vacantes = 50;
    private int clave_materia;
    private String nombre;
    private int creditos;
    private Scanner sc = new Scanner(System.in);
    
    public void capturar() {
        System.out.println("Clave de la materia: ");
        clave_materia=sc.nextInt();
        System.out.println("Nombre de la materia: ");
        sc.nextLine();
        nombre=sc.nextLine();
        System.out.println("Creditos: ");
        creditos=sc.nextInt();
    }

    public void actualizarVacantes(){
        vacantes--;
    }

    @Override
    public String toString() {
        return "Materia\nVACANTES:"+vacantes + "{clave_materia=" + clave_materia + ", nombre=" + nombre + ", creditos=" + creditos + '}';
    }
    
}
