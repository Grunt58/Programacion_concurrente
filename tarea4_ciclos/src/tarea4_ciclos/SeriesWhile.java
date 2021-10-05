package tarea4_ciclos;
import java.util.Scanner;

/**
 *
 * @author null
 */
public class SeriesWhile {
    // ATRIBUTOS
    private int n, i, op;
    Scanner input = new Scanner(System.in);
    
    // CONSTRUCTOR
    SeriesWhile(){
        System.out.println("------------------------");
        System.out.println("[SERVER]: Creación del objeto.");
        System.out.println("------------------------");
    }
    
    // MÉTODOS        
    void CapturarN(){ // SET_n
        System.out.print("Valor para n: ");
        n = input.nextInt();
    }
    
    // Serie 1
    void Serie3En3(){
        if(n > 0){
            i = 0;
            System.out.println("------------------------");
            System.out.println("Serie 0-" + n + " de 3 en 3:");
            while(i <= n){
                if(i % 3 == 0){
                    System.out.println("\t" + i);
                    i++;
                } else {
                    i++;
                }
            }
            System.out.println("------------------------");            
        } else {
            System.out.println("------------------------");
            System.out.println("[ERROR]: \"n\" debe ser mayor a 0.");
            System.out.println("------------------------");
        }  
    }
    
    //Serie 2
    void SerieMenosN(){
        n = -n;
        i = 0;
        System.out.println("------------------------");
        System.out.println("Serie 0 a el número negativo de " + n + ".");
        while(i >= n){
            System.out.println("\t" + i);
            i--;
        }  
        System.out.println("------------------------");
    }
    
    /*
    Serie 3, el mismo que el 2
    */
    
    // Indica que el programa ha terminado
    void Salir(){
        System.out.println("------------------------");
        System.out.println("[SERVER]: Programa terminado.");
        System.out.println("------------------------");
    }    
}
