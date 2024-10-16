/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package violacionPrincipios;

/**
 *
 * @author Yi Daniel Chen Liu
 */

/**
 * Esta clase viola los principios de inversión de dependencias, ya que la clase depende directamente de la clase Bombilla. En caso de realizar cambios en la clase Bombilla, también
 * tendríamos que cambiar parte de la clase Interruptor. Lo cual presentaría trabajo innecesario 
 * 
 */
public class Interruptor {

    private Bombilla bombilla;

    public Interruptor(Bombilla bombilla) {
        this.bombilla = bombilla;
    }

    public void operar() {
        bombilla.encender();
// Más tarde: bombilla.apagar();
    }
}
