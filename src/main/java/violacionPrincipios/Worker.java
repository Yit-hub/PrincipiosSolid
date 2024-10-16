/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package violacionPrincipios;

/**
 *
 * @author DAW2
 */
/**
 * 
 * Esta interfaz viola los principios de Segregación de interfaces, ya que de esta interfaz hace uso la clase RobotWorker, y la clase HumanWorker, en el caso de la clase 
 * RobotWorker, esta no realiza la función de eat, por lo que no tiene sentido que esta sea implementada.
 */
public interface Worker {

    void work();

    void eat();
}
