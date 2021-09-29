package practica5_ciclos;
import java.util.Scanner;

/*
 *
 * @author null
 */
public class SerieNumImpares {
    int n_ini, n_fin;
    private Scanner input = new Scanner(System.in);
    
    public void CapturarLimites(){
        // Capturamos ambas variables
        System.out.print("Número inicial: ");
        n_ini = input.nextInt();
        System.out.print("Número final: ");
        n_fin = input.nextByte();
    }

    // while
    public void ImprimirSerieW(){
        System.out.println("Números impares de " + n_ini + " y " + n_fin);
        while(n_ini <= n_fin){
            if(n_ini % 2 != 0){
                System.out.println(n_ini);
            }
            n_ini++;
        }
    }


    // do-while
    public void ImprimirSerieDW(){
        System.out.println("Números impares de " + n_ini + " y " + n_fin);
        do{
            if(n_ini % 2 != 0){
            System.out.println(n_ini);
            n_ini++;  
            } else {
                n_ini++;
            }
        } while(n_ini <= n_fin);
    }


    // for
    public void ImprimirSerieF(){
        System.out.println("Números impares de " + n_ini + " y " + n_fin);
        for(;n_ini <= n_fin; n_ini++){
            if(n_ini % 2 != 0){
                System.out.println(n_ini);
            }
        }
    }

}
