/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResponsabilidadUnica;

/**
 *
 * @author Yi Daniel Chen Liu
 */

/**
 * Esta clase cumple con los principios solid, ya que tiene una única responsabilidad, la de dar forma a los reportes
 * 
 */
public class Report {

    private String title;
    private String body;

    public Report(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }
}
