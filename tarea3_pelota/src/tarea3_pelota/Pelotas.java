//Tarea 3
//Equipo 8
//Elaborado por Erik Barrera

package tarea3_pelota;

import java.util.Scanner;

public class Pelotas 
{
    //ATRIBUTOS
    private String tipo, color, tamano, textura;
    private Scanner sc = new Scanner(System.in);
    
    //CONSTRUCTORES
    public Pelotas(String tipo_pelota, String color_pelota, String tamano_pelota, String textura_pelota) //Pelota 1
    {
        System.out.println("------------------------");
        System.out.println("Creación del objeto 1");
        tipo = tipo_pelota;
        color = color_pelota;
        tamano = tamano_pelota;
        textura = textura_pelota;
    }
    
    public Pelotas(String tipo_pelota, String color_pelota) //Pelota 2 y 3
    {
        System.out.println("------------------------");
        System.out.println("Creación del objeto 2 y 3");
        tipo = tipo_pelota;
        color = color_pelota;
    }    
    
    //METODOS
    public void captura_datos()
    {
        System.out.println("------------------------");
        System.out.println("Captura del objeto 2 y 3");
        System.out.print("Tamaño: ");
        tamano = sc.nextLine();
        
        System.out.print("Textura: ");
        textura = sc.nextLine();
    }
    
    public void listar()
    {
        System.out.println("######################");
        System.out.println("Tipo: " + tipo);
        System.out.println("Color: " + color);
        System.out.println("Tamaño: " + tamano);
        System.out.println("Textura: " + textura);
        System.out.println("######################");
        
    }
}