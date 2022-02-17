package hilosconsola;
import java.util.Scanner;

public class HilosConsola {

    public static void main(String[] args) {
        int opc;
        Scanner input = new Scanner(System.in);
        
        do{
            System.out.println("1. Ascendente\n2. Descendente\n3. Salir\nElige una opción");
            opc = input.nextInt();
            
            switch(opc){
                case 1:
                    Ascendente hilo1;
                    hilo1=new Ascendente();
                    hilo1.start();
                    break;
                case 2:
                    for(int i=25000;i>=0;i--){
                        System.out.println("Descedente "+i);
                    }
                    break;
                case 3:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Fuera de rango");
                    break;
            }
        }while(opc!=3);
    } 
}
