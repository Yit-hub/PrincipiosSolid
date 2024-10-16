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
 * Esta clase cumple con los principios abierto/cerrado, ya que realiza una única función y se pueden realizar cambios a futuro mediante la utilización de la interfaz Drawable.
 */
// Clase de cliente que usa Drawable
public class ShapeDrawer {

    private Drawable shape;

    public ShapeDrawer(Drawable shape) {
        this.shape = shape;
    }

    public void drawShape() {
        shape.draw();
    }
}
