/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrincipioSustitucionLiskov;

/**
 *
 * @author Yi Daniel Chen Liu
 */
/**
 * 
 * En este caso, la clase cumple con los principios de sustitución de Liskov, ya que todas las clases que heredan la clase Shape, implementan la funcíon de área, evitando así excepciones.
 */
public abstract class Shape {

    public abstract double area();
}
