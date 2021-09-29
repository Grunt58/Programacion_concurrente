package practica5_ciclos;
import java.util.Scanner;

/*
 *
 * @author null
 */
public class SerieNumPares {
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
        System.out.println("Números naturales pares de " + n);
        while(i <= n){
            if(i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
    }


    // do-while
    public void ImprimirSerieDW(){
        int i = 1;
        System.out.println("Números naturales pares de " + n);
        do {
            if(i % 2 == 0){
                System.out.println(i);
                i++;
            } else {
                i++;
            }
        } while(i <= n);
    }

    // for
    public void ImprimirSerieF(){
        System.out.println("Números naturales pares de " + n);
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
