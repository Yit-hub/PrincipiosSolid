/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrincipioOCP;

/**
 *
 * @author Yi Daniel Chen Liu
 */
/**
 * 
 * Esta clase cumple con los principios abierto/cerrado, ya que hace uso de una interfaz y sobreescribe según sea conveniente para la clase
 */
// Implementación de un círculo
public class Circle implements Drawable {

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
