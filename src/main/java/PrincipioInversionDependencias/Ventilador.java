/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrincipioInversionDependencias;

/**
 *
 * @author DAW2
 */
public class Ventilador implements Encendible {

    @Override
    public void encender() {
        System.out.println("El ventilador está encendido");
    }

    @Override
    public void apagar() {
        System.out.println("El ventilador está apagada");
    }
}
