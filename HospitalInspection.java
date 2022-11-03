/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question2;

/**
 *
 * @author Sukoluhle Ndlovu
 */
//Create a subclass called Hospital Inspections that extends the Inspection class
public class HospitalInspection extends Inspection {
  //Create a constructor to accept the hospital location, name and years since the inspections
  public HospitalInspection(String place, String hospname, int years) {
    super(place, hospname, years);
  }
  // Create a method called printInspectionsReport that prints the hospital location, hospital name, years
  public void printInspectionReport() {
    System.out.println("\nHOSPITAL INSPECTION REPORT");
    System.out.println("***********************");
    System.out.println("HOSPITAL LOCATION: " + getLocation());
    System.out.println("HOSPITAL NAME: " + getHospitalName());
    System.out.println("YEARS SINCE INSPECTION: " + getYearsSinceInspection());
    System.out.println("INSPECTION NEEDED: " + getInspectionNeeded());

  }
  //Create a method that checks if a hospital has been inspected
  // This method will check if an inspection for more than two years is required to have an inspection.
  @Override
  public String getInspectionNeeded() {
    if (getYearsSinceInspection() > 2)
      return "YES";
    return "NO";
  }
}