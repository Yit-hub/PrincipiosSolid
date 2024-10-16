/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package violacionPrincipios;

/**
 *
 * @author Yi Daniel Chen Liu
 */
public class RobotWorker implements Worker {

    @Override
    public void work() {
        System.out.println("Working...");
    }

    /**
     * La función eat() no es realizada por los robot, por lo que incumple los principios de Segregación de interfaces, es una función que no se puede implementar en todas las clases
     * que heredan la interfaz.
     */
    @Override
    public void eat() {
        throw new UnsupportedOperationException("Robots don't eat");
    }
}
