package isci_actividades_19_10_21;
import static java.lang.Math.PI;
import static java.lang.Math.sqrt;
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
        // Actividad 1  
        int tabla, res=1, i=1;
        
        System.out.print("Tabla de multiplicar de: ");
        tabla = input.nextInt();
        
        do{
                    
            res = tabla * i;    
            System.out.println(i + " x " + tabla + " = " + res);
            
            i++;
            
        }while(i <= 10);
        */
        
        /*
        // Actividad 2
        int tabla_i, tabla_f, res=1, i;
        
        System.out.print("Tabla inicial: ");
        tabla_i = input.nextInt();
        
        System.out.print("Tabla final: ");
        tabla_f = input.nextInt();
        
        while(tabla_i <= tabla_f){
            i=1;
            System.out.println("\nTabla: " + tabla_i);
            
            do{
                res = tabla_i * i;    
                System.out.println(i + " x " + tabla_i + " = " + res);
            
                i++;
            }while(i <= 10);
            tabla_i++;
        }
        */
        
        /*
        // Actividad 4
        int tabla, i, res;
        
        System.out.print("Tabla de multiplicar del: ");
        tabla = input.nextInt();
        
        for(i=1; i<=20; i++){
            res = tabla*i;
            System.out.println(i + " x " + tabla + " = " + res);            
        }
        */
        
        /*
        // Actividad 5
        int op, i, n, n_lados, n1, n2;
        double area=0, perimetro=0, radio, lado, prom=0;
        
        
        do{
            System.out.println("+++++++++++Cálculos matemáticos:+++++++++++");
            System.out.println("\t1. Cálculo de áreas (Triángulo, Círculo y Cuadrado)");
            System.out.println("\t2. Cálculo de perímetros (Polígonos de n lados)");
            System.out.println("\t3. Promedios de 10 números");
            System.out.println("\t4. Los números pares entre 2 números");
            System.out.println("\t5. Terminar");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
            System.out.print("Opción: ");
            
            op = input.nextInt();
            
            switch(op){
                case 1:
                    System.out.println("\nFiguras:");
                    System.out.println("\t1. Triángulo");
                    System.out.println("\t2. Círculo");
                    System.out.println("\t3. Cuadrado");
                    System.out.print("Opción: ");
                    
                    op = input.nextInt();
                    
                    switch(op){
                        case 1:
                            System.out.println("TRIÁNGULO");
                            System.out.print("Valor de lado: ");
                            
                            lado = input.nextDouble();
                            
                            area = (sqrt(3)/4) * (lado*lado);
                            System.out.println("Área: " + String.format("%.2f", area) + "m2");
                            break;
                            
                        case 2:
                            System.out.println("CÍRCULO");
                            System.out.print("Valor de radio: ");
                            
                            radio = input.nextDouble();
                            
                            area = (Math.pow(radio, 2))*PI;
                            System.out.println("Área: " + String.format("%.2f", area) + "m2");
                            break;
                            
                        case 3:
                            System.out.println("CUADRADO");
                            System.out.print("Valor de lado: ");
                            
                            lado = input.nextDouble();
                            
                            area = lado * lado;
                            System.out.println("Área: " + area + "m2");
                            break;
                            
                        default:
                            System.out.println("Fuera de rango (1-5)");
                            break;
                    }
                    break;
                    
                case 2:
                    System.out.print("Número de lado del polígono: ");
                    
                    n_lados = input.nextInt();
                    
                    System.out.print("Valor de lado del polígono: ");
                    
                    lado = input.nextDouble();
                    
                    for(i = 1; i <= n_lados; i++){
                        perimetro += lado;
                    }
                    System.out.println("Perímetro: " + perimetro + "m");
                    break;
                    
                case 3:
                    System.out.println("PROMEDIO");
                    
                    for(i = 1; i <=  10; i++){
                        System.out.print("Valor [" + i + "]: ");
                        n = input.nextInt();
                        
                        prom += n;
                    }
                    
                    prom /= 10;
                    
                    System.out.println("El resultado es: " + prom);
                        
                    break;
                    
                case 4:        
                    System.out.println("NÚMERO PAR DE UN RANGO DE NÚMEROS: ");
                    System.out.print("Número inicial: ");
                    n1 = input.nextInt();

                    System.out.print("Número final: ");
                    n2 = input.nextInt();
                    
                    System.out.println("Números PAR del rango " + n1 + "-" + n2);
                    while(n1 <= n2){
                        if(n1 % 2 == 0){
                            System.out.println(n1);
                        }
                        n1++;
                    }
                    break;
                    
                case 5:
                    System.out.println("Programa terminado...");
                    break;
                    
                default:
                    System.out.println("Fuera de rango (1-5)");
                    break;
            }
        }while(op != 5);
        */
    }
}
