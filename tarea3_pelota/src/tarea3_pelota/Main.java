package tarea3_pelota;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
        
        String tipo, color, tamano, textura;
        
        // datos objeto1
        System.out.print("Tipo: ");
        tipo = sc.nextLine();
        System.out.print("Color: ");
        color = sc.nextLine();
        System.out.print("Tamaño: ");
        tamano = sc.nextLine();
        System.out.print("Textura: ");
        textura = sc.nextLine();
        Pelotas pelota_1 = new Pelotas(tipo, color, tamano, textura);
        
        // datos objeto2
        Pelotas pelota_2 = new Pelotas("futbol", "blanco");
       
        // datos objeto3
        Pelotas pelota_3 = new Pelotas("tennis", "verde");
        
        // captura datos de pelota2 y 3
        pelota_2.captura_datos();
        pelota_3.captura_datos();
        
        
        // lista los 3 objetos
        pelota_1.listar();
        pelota_2.listar();
        pelota_3.listar();
    }
    
}
