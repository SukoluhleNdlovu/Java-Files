/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package question2;

import javax.swing.JOptionPane;
/**
 *
 * @author Sukoluhle Ndlovu
 */
// Write a Use_Inspection class to instantiate the Hospital Inspections class
public class Use_Inspection {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Ask the user to enter the location
        String place = JOptionPane.showInputDialog("Enter the hospital location: ");
        //Ask the user to enter the hospital name
        String hospitalName = JOptionPane.showInputDialog("Enter the hospital name: ");
        //Ask the user to enter the years since last inspection
        String numYears = JOptionPane.showInputDialog("Enter years since last inspection: ");
        int years = Integer.parseInt(numYears);
        //Creating an object for HospitalInspections class
        HospitalInspection details = new HospitalInspection(place, hospitalName, years);
        //Call the method printInspectionReport using object details
        details.printInspectionReport();
    }

}
