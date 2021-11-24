package practica13excepcionesE1;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica13ExcepcionesE1 {

    public static void main(String[] args) throws IndexOutOfBoundsException, IOException{
        Scanner sc = new Scanner(System.in);
        int[] array = {4, 2, 6, 7};
        int n;
        boolean repetir;
        
        /*        
        System.out.print("Introduce un número entero entre 0 y  " + (array.length - 1) + ": ");
        n = sc.nextInt();
        System.out.println("Valor en la posición " + n + ": " + array[n]);
        */
        
        
         do{
            try{
                repetir = false;
                System.out.print("Introduce un número entero entre 0 y  " + (array.length-1) + ": ");
                n = sc.nextInt(); 
                System.out.println("Valor en la posición " + n + ": " + array[n]);
            }catch(InputMismatchException e){
               sc.nextLine();
               System.out.println("(Tirado) Debe introducir un número ENTERO "); 
            repetir = true;
            }
         }while(repetir);
            
         char car;
         System.out.println("Introduce un caracter");
         car = (char)System.in.read();
         System.out.println("El caracter fue "+car);

    }
}
