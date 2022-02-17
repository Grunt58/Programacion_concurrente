package hilosconsola;

public class Ascendente extends Thread{
    
    @Override
    public void run(){ // Tarea del hilo
        for(int i=0;i<500000;i++){
            System.out.println("Ascendente "+i);
        }        
    }
}
