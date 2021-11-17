/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_motor_practica11.en_clase;

/**
 *
 * @author null
 */
public class Taller {
    public void recibirMotor(Motor motor){
        if(motor instanceof MotorElectrico){
            System.out.println("Se recibió motor eléctrico"); 
        } else if(motor instanceof MotorExplosion){
            System.out.println("Se recibió motor explosión");
        } else if(motor instanceof MotorVapor){
            System.out.println("Se recibió motor de vapor");
        }
    }
}
