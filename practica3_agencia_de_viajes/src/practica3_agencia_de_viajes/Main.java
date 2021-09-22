// PRACTICA 3

package practica3_agencia_de_viajes;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args)
    {
        int clave_empleado;
        String nombre;
        float sueldo;
        int años;
        final Scanner sc = new Scanner(System.in); 
       
        
        Empleados_clase Empleado1 = new Empleados_clase(340278510, "Erik Barrera");
        Empleados_clase Empleado2 = new Empleados_clase(333333333, "Juan Lopez", 5525.50f);
        Empleados_clase Empleado3 = new Empleados_clase("Jose Perez", 4521.20f);
        
        
        
        System.out.println("¿Cuantos años llevas trabajando aquí?");
        años = sc.nextInt();
        Empleado1.setAños(años);
        
        System.out.println("¿Cuantos ganas?");
        sueldo = sc.nextFloat();
        Empleado1.setSueldo(sueldo);
        
        System.out.println("¿Cuantos años llevas trabajando aquí?");
        años = sc.nextInt();
        Empleado2.setAños(años);
        
        System.out.println("¿Cuantos años llevas trabajando aquí?");
        años = sc.nextInt();
        Empleado3.setAños(años);
        
        System.out.println("¿Cuál es tu clave?");
        clave_empleado = sc.nextInt();
        Empleado3.setClave_empleado(clave_empleado);
        
        
        
        System.out.println("Lista de empleados");
        Empleado1.listarEmpleados();
        Empleado1.calcularSueldo();
        Empleado2.listarEmpleados();
        Empleado2.calcularSueldo();
        Empleado3.listarEmpleados();
        Empleado3.calcularSueldo();
        
        
        

        System.out.println("Lista de empleados actualizada");
        Empleado1.listarEmpleados();
        Empleado2.listarEmpleados();
        Empleado3.listarEmpleados();

        
        
        
        
    }
    
}
