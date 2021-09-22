// PRACTICA 3

package practica3_agencia_de_viajes;

import java.util.Scanner;

public class Empleados_clase
{
    //ATRIBUTOS
    private int clave_empleado;
    private String nombre;
    private float sueldo;
    private int años;
    private final Scanner sc = new Scanner(System.in); 

    
    
    
    //CONSTRUCTORES
    public Empleados_clase(int clave_empleado, String nombre) //Primer Constructor
    {
        System.out.println("Se ha creado un empleado");
        this.clave_empleado = clave_empleado;
        this.nombre = nombre;
    }
    
    public Empleados_clase(int clave_empleado, String nombre, float sueldo) //Segundo Constructor
    {
        System.out.println("Se ha creado un empleado");
        this.clave_empleado = clave_empleado;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    
    public Empleados_clase(String nombre, float sueldo) //Tercer Constructor
    {
        System.out.println("Se ha creado un empleado");
        this.nombre = nombre;
        this.sueldo = sueldo;

    }
    
    
    
    //METODOS

    public void setClave_empleado(int clave_empleado) {
        this.clave_empleado = clave_empleado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public void setAños(int años) {
        this.años = años;
    }
          
    
    
    
    
    
    public void calcularSueldo()
    {
        if (años >= 10)
        {
            sueldo = sueldo*0.10f+sueldo;
            System.out.println("Tu sueldo aumeto un 10%, po rlo que ahora es de:  " + sueldo);
        }
        else if (años >=5 && años <= 9)
        {
            sueldo = sueldo*0.05f+sueldo;
            System.out.println("Tu sueldo aumeto un 5%, po rlo que ahora es de:  " + sueldo);

        }
        else if (años >=1 && años <= 4)
        {
            sueldo = sueldo*0.03f+sueldo;
            System.out.println("Tu sueldo aumeto un 3%, po rlo que ahora es de:  " + sueldo);
        }
        else
        {
            System.out.println("No recibiste aumento de sueldo");
        }
    }
    
    public void listarEmpleados()
    {
        System.out.println("Nombre: "+ nombre +"\tClave: "+clave_empleado+"\tAños trabajados: "+años+"\tSueldo: "+ sueldo);
    }
}
