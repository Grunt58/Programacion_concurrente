package herencia.herenciaalumnoprofesor;
import java.util.ArrayList;

/**
 *
 * @author null
 */

public class HerenciaAlumnoProfesor {
    public static void main(String[] args) {
        /*
        Profesor  profe = new Profesor();
        Profesor profe2 = new Profesor("Eduardo", 563456, "FD543534");
        Alumno alumno = new Alumno();
        Alumno alumno2;
        
        System.out.println("Registrando un alumno:");
        System.out.println("=======================");
        alumno.capturar();
        
        System.out.println("Registrando alumno2:");
        System.out.println("=======================");
        
        alumno2 = new Alumno(213, "Jose", 321, "gfdsg", 32);
        
        System.out.println(alumno.toString());
        System.out.println(alumno2.toString());
        

        System.out.println("Registrando un profesor:");
        System.out.println("=======================");
        profe.capturar();
        System.out.println(profe.toString());
        
        System.out.println("Registrando profesor2:");
        System.out.println("=======================");
        System.out.println(profe2.toString());
        */
        
        ArrayList<Alumno> grupoPOO = new ArrayList<>();
        Alumno alumno;
        // Llenando el arreglo de alumnos
        for(int i=0; i<3; i++){
            alumno = new Alumno();
            alumno.capturar();
            grupoPOO.add(alumno);
        }
        
        // Mostrando información del alumno de grupoPOO
        for(int i=0; i<grupoPOO.size(); i++){
            System.out.println(grupoPOO.get(i).toString());
        }
        
        // 1. Imprimir el número de alumnos registrados en el grupo
        System.out.println("\n\nAlumnos registrados del grupo POO: [" + grupoPOO.size() + "]");
        
        // 2. Imprimir a pantalla el alumno 1
        System.out.println("\n\nAlumno: " + grupoPOO.get(1));
        
        // 3. Borrar el alumno 1
        alumno = grupoPOO.remove(1);
        System.out.println("\n\nAlumno 2 eliminado.");
        // Impresión de la lista sin alumno 2
        System.out.println("Lista sin el alumno 2 [pos 1]");
        for(int i=0; i<grupoPOO.size(); i++){
            System.out.println(grupoPOO.get(i).toString());
        }
        
        // 4. El alumno borrado insertarlo en la posición 0 del grupo.
        grupoPOO.add(0, alumno);
        System.out.println("\n\nLista con el alumno 2 en la posición 0");
        for(int i=0; i<grupoPOO.size(); i++){
            System.out.println(grupoPOO.get(i).toString());
        }
        
        // 5. Crear un objeto alumno y actualizar el alumno en la posición 2 del grupo por este nuevo alumno.
        alumno = new Alumno();
        alumno.capturar();
        
        grupoPOO.set(2, alumno);
        // Impresión de la lista con nuevo alumno actualizado
        System.out.println("\n\nImpresión de la lista con nuevo alumno actualizado");
        for(int i=0; i<grupoPOO.size(); i++){
            System.out.println(grupoPOO.get(i).toString());
        }
    }
}