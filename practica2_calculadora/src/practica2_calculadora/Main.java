/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2_calculadora;
import java.util.Scanner;
/*
 *
 * @author null
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        // Creación del objeto calculadora
        Calculadora cal = new Calculadora();
        
        // Variables
        int a,b;
        float res;
        
        // Invocar método sumar
        cal.sumar();
        
        // Pedimos valores para pasarlos al método restar
        System.out.print("Valor 1: ");
        a = input.nextInt();
        System.out.print("Valor 2: ");
        b = input.nextInt();
        
        // Invocamos al método y pasamos variables
        cal.restar(a, b);
        
        // Igualamos la variable "res" a la respuesta del método multiplicar gracias al return
        res = cal.multiplicar();
        System.out.println("El resultado de la multiplicación es " + res);
        
        // Invocamos al método dividir
        cal.dividir();
        // Imprimimos el retorno del método getN1, getN2 y getRes
        System.out.println(cal.getN1() + " / " + cal.getN2() + " = " + cal.getRes());
    }
    
}
