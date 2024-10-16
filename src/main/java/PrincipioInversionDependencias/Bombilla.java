/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrincipioInversionDependencias;

/**
 *
 * @author DAW2
 */
// Implementación de la interfaz Encendible para una bombilla
public class Bombilla implements Encendible {

    @Override
    public void encender() {
        System.out.println("La bombilla está encendida");
    }

    @Override
    public void apagar() {
        System.out.println("La bombilla está apagada");
    }
}
