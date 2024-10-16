/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrincipioSegregacionInterfaces;

/**
 *
 * @author Yi Daniel Chen Liu
 */
/**
 * 
 * En este caso la clase, solo implementa la interfaz Workable, y puede realizar todas las funciones de dicha interfaz, por lo que cumple con los principios de segregación de 
 * interfaces
 */
public class RobotWorker implements Workable {

    @Override
    public void work() {
        System.out.println("Working...");

    }
}
