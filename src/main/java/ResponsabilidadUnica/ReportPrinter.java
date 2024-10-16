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
 * Esta clase cumple con los principios solid, ya que tiene una única responsabilidad, la imprimir los reportes
 * 
 */
public class ReportPrinter {

    public void printReport(Report report) {
// Imprime el reporte
        System.out.println("Printing report: " + report.getTitle());
    }
    
}
