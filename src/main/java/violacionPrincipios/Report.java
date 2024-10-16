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
 * Esta clase Report, viola los principios de responsabilidad única, ya que tiene dos responsabilidades: la de generar un reporte, y la de imprimir el reporte.
 * 
 */
public class Report {

    private String title;
    private String body;

    public Report(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public void generateReport() {
// Genera el reporte en un formato específico
        System.out.println("Generating report...");
    }

    public void printReport() {
// Imprime el reporte
        System.out.println("Printing report: " + title);
    }
}
