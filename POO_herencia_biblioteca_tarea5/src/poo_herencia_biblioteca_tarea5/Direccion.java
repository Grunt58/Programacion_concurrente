package poo_herencia_biblioteca_tarea5;
import java.util.Scanner;

/**
 * @author Equipo 3
 * Luis Fernando Robles Alcala
 * Luis Fernando Hernandez Huerta
 * Magaly Monter Velarde
 * Gerardo Emanuel Bautista Nava
 * Arturo Sebastian Ayala Lorenzo
 * Manuel Alejandro Falfan Cortes
 * Jorge Tirado Uriza
 */

public class Direccion {
   private int numero, CP;
   private String calle, col;
   private Scanner input;
   
   // Constructor   
   public Direccion(){
       input = new Scanner(System.in);
   }
   
   // Getters y Setters
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setCol(String col) {
        this.col = col;
    }

    public void setCP(int CP) {
        this.CP = CP;
    }
    
    @Override
    public String toString() {
        return "--------------------------------"
                +"\nDIRECCIÓN"
                +"\n-Número: " + numero
                +"\n-Calle: " + calle
                +"\n-Col: " + col
                +"\n-CP: " + CP
                +"\n--------------------------------";
    }
    
    // Métodos
    public void capturarDireccion(){
        System.out.print("\n-Calle: ");
        calle=input.nextLine();
        System.out.print("-Numero: ");
        numero=input.nextInt();
        System.out.print("-Colonia: ");
        input.nextLine();
        col= input.nextLine();
        System.out.print("-cp: ");
        CP=input.nextInt();
        System.out.println("...............................");
        
        // Limpieza del buffer
        input.nextLine();
   }
}