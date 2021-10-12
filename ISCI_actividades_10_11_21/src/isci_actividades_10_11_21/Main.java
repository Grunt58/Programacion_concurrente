package isci_actividades_10_11_21;

import java.util.Scanner;

/**
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
        
        /*
        // Actividad 1 - if else
        int num;
        
        System.out.print("Ingresa un número: ");
        num = input.nextInt();
        
        if(num > 0){
            System.out.println("\"" + num + "\"" + " es positivo.");
        } else {
            System.out.println("\"" + num + "\"" + " es negativo.");
        */
        
        /*
        // Actividad 2 - if anidado
        int num;
        
        System.out.print("Ingresa un número: ");
        num = input.nextInt();
        
        if(num > 0){
            System.out.println("\"" + num + "\"" + " es positivo.");
        } else {
            if(num < 0){
                System.out.println("\"" + num + "\"" + " es negativo.");
            } else {
                System.out.println("\"" + num + "\"" + " es neutral.");
            }
        }
        */
        
        /*
        // Actividad 3 - if else if
        int num;
        
        System.out.print("Ingresa un número: ");
        num = input.nextInt();
        
        if(num >= -20 && num <= 14){
            System.out.println("Muy baja.");
        } else if(num >= 15 && num <= 19){
            System.out.println("Templado.");
        } else if(num >= 20 && num <= 24){
            System.out.println("Normal.");
        } else if(num >= 25 && num < 32){
            System.out.println("Caluroso.");
        }else  if(num >= 33){
            System.out.println("Extremo.");
        }
        */
        
        /*
        // Actividad 4 - if else if
        int monto, meses;
        double interes=0, interes_p=0, interes_d=0, total=0, m_mensual_int=0, m_mensual=0;
        System.out.print("Ingresa el Monto: ");
        monto = input.nextInt();
        
        // limpiamos el buffer
        input.nextLine();
        
        // validamos que el monto no sea negativo
        if(monto > 0){
            System.out.print("¿A cuentos meses?: ");
            meses = input.nextInt();
            if(monto >= 1 && monto <= 4999){
                interes = 7.3;
                interes_p = 0.073;
                
                m_mensual = monto/meses;
                interes_d = m_mensual*interes_p;
                m_mensual_int = m_mensual+interes_d;
                total = m_mensual_int*meses;
            } else if(monto >= 5000 && monto <= 9999){
                interes = 8.9;
                interes_p = 0.089;
                
                m_mensual = monto/meses;
                interes_d = m_mensual*interes_p;
                m_mensual_int = m_mensual+interes_d;
                total = m_mensual_int*meses;
            } else if(monto >= 10000 && monto <= 49999){
                interes = 11;
                interes_p = 0.11;
                
                m_mensual = monto/meses;
                interes_d = m_mensual*interes_p;
                m_mensual_int = m_mensual+interes_d;
                total = m_mensual_int*meses;
            } else if(monto >= 50000){
                interes = 12.9;
                interes_p = 0.129;
                
                m_mensual = monto/meses;
                interes_d = m_mensual*interes_p;
                m_mensual_int = m_mensual+interes_d;
                total = m_mensual_int*meses;
            }
            System.out.println("**************************************************");
            System.out.println("\tPrestamos \"Rapiditos\"");
            System.out.println("Monto: " + monto);
            System.out.println("Interés:"+ interes +"% \tInterés: " + interes_d + "$");
            System.out.println("Total a pagar: "+ total +"\tMeses: " + meses);
            System.out.println("Monto mensual: " + m_mensual_int);
            System.out.println("**************************************************");
        } else {
            System.out.println("El monto no debe ser negativo.");
        }
        */
        
        /*
        // Actividad 5
        int num;
        
        System.out.print("Ingrse un número entre 1 y 5: ");
        num = input.nextInt();
        
        switch(num){
            case 1:
                System.out.println("Número \"Uno\"");
                break;
                
            case 2:
                System.out.println("Número \"Dos\"");
                break;
                
            case 3:
                System.out.println("Número \"Tres\"");
                break;
                
            case 4:
                System.out.println("Número \"Cuatro\"");
                break;
                
            case 5:
                System.out.println("Número \"Cinco\"");
                break;
                
            default:
                System.out.println("Número fuera de rango.");
                break;
        }
        */
    }   
}