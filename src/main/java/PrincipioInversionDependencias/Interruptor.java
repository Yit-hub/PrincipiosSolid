/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrincipioInversionDependencias;

/**
 *
 * @author Yi Daniel Chen Liu
 */

/**
 * 
 * En este caso, la clase cumple con los principios de inversión de dependencias, ya que ahora depende de una interfaz, y no de una tipo de clase en concreto, cuyo caso permite
 * que se puedan añadir multiples dispositivos que cumplan con esta función.
 */
public class Interruptor {

    private Encendible dispositivo;

    public Interruptor(Encendible dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void operar() {
        dispositivo.encender();
// Más tarde: dispositivo.apagar();
    }
}
