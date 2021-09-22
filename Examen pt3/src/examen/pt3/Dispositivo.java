/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pt3;

/**
 *
 * @author GAMER
 */
import java.util.Scanner;
/**
 *
 * @author Equipo 4
 */
public class Dispositivo {
    private int voltaje = 0;

    Scanner sc = new Scanner(System.in);



    public void capturarVoltaje() {

    System.out.println("Introduzca el voltaje");

    voltaje = sc.nextInt();

    }



    public void validarVoltaje() {
        int margen_error, diferencia;
        System.out.println("Validando");

        if (voltaje >= 15 && voltaje <= 25) {
            diferencia = 20;
            margen_error = voltaje - diferencia;
            System.out.println("Dispositivo valido");

            System.out.println("Nivel 1");

            System.out.println("Margen de error = " + margen_error);

            }

        else if(voltaje >= 110 && voltaje <= 130) {
            diferencia = 120;
            margen_error = voltaje - diferencia;
            System.out.println("Dispositivo valido");

            System.out.println("Nivel 2");

            System.out.println("Margen de error = " + margen_error);

            }

        else if(voltaje >= 230 && voltaje <= 250) {
            diferencia = 240;
            margen_error = voltaje - diferencia;
            System.out.println("Dispositivo valido");

            System.out.println("Nivel 3");

            System.out.println("Margen de error = " + margen_error);

            } else {
                System.out.println("El voltaje solicitado es erróneo");
            }
        }
}   
