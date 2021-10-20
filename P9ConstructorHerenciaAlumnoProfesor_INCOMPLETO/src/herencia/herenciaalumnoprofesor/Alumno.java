package herencia.herenciaalumnoprofesor;

import java.util.Scanner;

/**
 *
 * @author null
 */

public class Alumno extends Persona{
    private int cuenta;

    public Alumno() {
    
    }
    
    public Alumno(int cuenta, String calle, int numero, String col, int cp) {
        this.cuenta = cuenta;
        direccion.setCalle(calle);
        direccion.setNumero(numero);
        direccion.setCol(col);
        direccion.setCP(cp);
        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        System.out.print("Edad: ");
        edad = sc.nextInt();
    }
   
    @Override
    public void capturar(){
        System.out.print("Numero de cuenta: ");
        cuenta = sc.nextInt();
        super.capturar();
    }

    @Override
    public String toString() {
        return "Alumno{" + "cuenta=" + cuenta + super.toString() +'}';
    }
}
