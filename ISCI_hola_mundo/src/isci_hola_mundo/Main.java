package isci_hola_mundo;
import java.util.Scanner;

/**
 *
 * @author null
 */
public class Main {

    public static void main(String[] args) {
        
        // [ACTIVIDAD 1]
        System.out.println("Hola mundo");
        
        // var
        var cadena = "Es una cadena";
        System.out.println(cadena);
        
        // No me acuerdo que era XD
        int a = 10;
        float b = 4.5f;
        System.out.println("Los números son " + a + " y " + b);
        
        
        // Concatenación de cadenas
        var universidad = "Universidad del Valle de México";
        var campus = "Coyoacán";
        System.out.println("Universidad: " + universidad + "\nCampus: " + campus);
        
        // Parte 2
        var direccion = "Tlalpan";
        int numero = 2056;
        System.out.println(direccion + " " + numero);

        // [ACTIVIDAD 2]
        var universidad = "Universidad del Valle de México";
        var campus = "\"Coyoacán\"";
        var nombre = "\'Jorge Tirado Uriza\'";
        int semestre = 6;
        System.out.println("Universidad: " + universidad + "\nCampus: " + campus + "\nNombre: " + nombre + "\nSemestre:" + semestre);
        
        
        // Scanner
        System.out.println("Introducir un dato: ");
        Scanner dato = new Scanner(System.in);
        var mensaje = dato.nextLine();
        System.out.println("\nEste es el valor introducido");
        System.out.println(mensaje);
        
        
        // Tipos de dato
        // byte [ACTIVIDAD 3]
        byte tamanoByte = 100;
        
        System.out.println("El valor de la variable tipo byte es: " + tamanoByte);
        System.out.println("El valor mínimo del tipo byte es: " + Byte.MIN_VALUE);
        System.out.println("El valor máximo del tipo byte es: " + Byte.MAX_VALUE);
        

        //short [ACTIVIDAD 4]
        short tamanoShort = 1000;
        
        System.out.println("El valor de la variable tipo short es: " + tamanoShort);
        System.out.println("El valor mínimo del tipo short es: " + Short.MIN_VALUE);
        System.out.println("El valor máximo del tipo short es: " + Short.MAX_VALUE);

        //integer [ACTIVIDAD 5]
        int tamanoInt = 1000;
        
        System.out.println("El valor de la variable tipo Int es: " + tamanoInt);
        System.out.println("El valor mínimo del tipo Integer es: " + Integer.MIN_VALUE);
        System.out.println("El valor máximo del tipo Integer es: " + Integer.MAX_VALUE);
        

        //long [ACTIVIDAD 5]
        long tamanoLong = 1000;
        
        System.out.println("El valor de la variable tipo long es: " + tamanoLong);
        System.out.println("El valor mínimo del tipo long es: " + Long.MIN_VALUE);
        System.out.println("El valor máximo del tipo long es: " + Long.MAX_VALUE);
        
        
        //float [ACTIVIDAD 6]
        float tamanoFloat = 10.0f;
        
        System.out.println("El valor de la variable tipo float es: " + tamanoFloat);
        System.out.println("El valor mínimo del tipo Float es: " + Float.MIN_VALUE);
        System.out.println("El valor máximo del tipo Float es: " + Float.MAX_VALUE);
        

        //double [ACTIVIDAD 6]
        double tamanoDouble = 120.0f;
        
        System.out.println("El valor de la variable tipo double es: " + tamanoDouble);
        System.out.println("El valor mínimo del tipo Double es: " + Double.MIN_VALUE);
        System.out.println("El valor máximo del tipo Double es: " + Double.MAX_VALUE);
        
        
        // Lectura del teclado y conversión
        // tipo Integer
        System.out.println("Introduce un número: ");
        Scanner consola = new Scanner(System.in);
        var dato1 = Integer.parseInt(consola.nextLine());
        System.out.println("\nEste es el valor introducido");
        System.out.println(dato1+1);
        
        // tipo Integer sin conversión [error]
        System.out.println("Introduce un número: ");
        Scanner consola = new Scanner(System.in);
        var dato1 = consola.nextLine();
        System.out.println("\nEste es el valor introducido");
        System.out.println(dato1+1);
        
        
        // tipo Float
        var flotante = Float.parseFloat("333314159");
        System.out.println("El valor de Flotante es: " + flotante);
        
        
        // tipo Double
        var PI = Double.parseDouble("3.14159");
        System.out.println("El valor de PI es: " + PI);
        
        
        // Leer 2 datos e imprimir su suma [ACTIVIDAD 7]
        //int 
        Scanner input = new Scanner(System.in);
        System.out.println("Suma de 2 números.");
        
        System.out.print("Introduzca el valor 1: ");
        var n_1 = Integer.parseInt(input.nextLine());
        System.out.print("Introduzca el valor 2: ");
        var n_2 = Integer.parseInt(input.nextLine());
        
        int res = n_1+n_2;
        
        System.out.println("\"La suma de " + n_1 + " + " + n_2 + " es igual a " + res + "\"");
        
        
        //float
        Scanner input = new Scanner(System.in);
        System.out.println("Suma de 2 números.");
        
        System.out.print("Introduzca el valor 1: ");
        var n_1 = Float.parseFloat(input.nextLine());
        System.out.print("Introduzca el valor 2: ");
        var n_2 = Float.parseFloat(input.nextLine());
        
        float res = n_1+n_2;
        
        System.out.println("\"La suma de " + n_1 + " + " + n_2 + " es igual a " + res + "\"");
        
    }
}
