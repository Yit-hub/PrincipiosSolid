/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package violacionPrincipios;

/**
 *
 * @author Yi Daniel Chen Liu
 */
/*
    Esta clase viola los principios de sustitución de Liskov, ya que hereda el método fly de la clase Bird, pero lanza una excepción, cosa la cual no puede pasar,
    ya que se espera que la clase fly de Bird funcione perfectamente, la clase derivada introduce un comportamiento que no es compatible con la clase padre.
*/
public class Ostrich extends Bird {

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostriches can't fly");
    }
}
