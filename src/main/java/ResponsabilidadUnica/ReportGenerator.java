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
 * Esta clase cumple con los principios solid, ya que tiene una única responsabilidad, la de generar los reportes
 * 
 */
public class ReportGenerator{

    public void generateReport(Report report) {
// Genera el reporte en un formato específico
        System.out.println("Generating report: " + report.getTitle());
    }
}
