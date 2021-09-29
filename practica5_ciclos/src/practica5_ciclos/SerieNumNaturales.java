package practica5_ciclos;
import java.util.Scanner;

/**
 *
 * @author null
 */


public class SerieNumNaturales {
    int n;
    private Scanner input = new Scanner(System.in);
    
    public void CapturarN(){
        System.out.print("Número: ");
        // Capturamos n
        n = input.nextInt();
    }

// while
    public void ImprimirSerieW(){
        int i = 1;
        // Imprime los valores naturales de "n"
        System.out.println("Números naturales de " + n);
        while(i <= n){
            System.out.println(i);
            i++;
        }
    }


// do-while
    public void ImprimirSerieDW(){
        int i = 1;
        System.out.println("Números naturales de " + n);
        // Imprime los valores naturales de "n"
        do{
            System.out.println(i);
            i++;
        } while(i <= n);
    }   

    // for
    public void ImprimirSerieF(){
        System.out.println("Números naturales de " + n);
        for(int i = 1; i <= n; i++){
            System.out.println(i);
        }
    }
}