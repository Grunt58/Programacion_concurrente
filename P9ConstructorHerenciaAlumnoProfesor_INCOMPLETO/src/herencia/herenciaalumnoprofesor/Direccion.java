
package herencia.herenciaalumnoprofesor;

import java.util.Scanner;

/**
 *
 * @author null
 */

public class Direccion {
   private int numero;
   private String calle;
   private String col;
   private int CP;
   private Scanner sc;
   
   public Direccion(){
       sc = new Scanner(System.in);
   }
   
   public void capturarDireccion(){
        System.out.print("\n\tCalle:");
        calle=sc.nextLine();
        System.out.print("\tnumero: ");
        numero=sc.nextInt();
        System.out.print("\tColonia:");
        sc.nextLine();
        col= sc.nextLine();
        System.out.print("\tcp: ");
        CP=sc.nextInt();
        System.out.println();
   }

    @Override
    public String toString() {
        return "Direccion{" + "numero=" + numero + ", calle=" + calle + ", col=" + col + ", CP=" + CP + '}';
    }

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
}
