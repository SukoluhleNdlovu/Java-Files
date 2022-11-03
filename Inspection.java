/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question2;

/**
 *
 * @author Sukoluhle Ndlovu
 */
// Create an abstract class named Inspection that contains variables to store.
public abstract class Inspection implements iInspection {
    //instance variables
    private final String location;
    private final String hospitalName;
    private final int yearsSinceInspection;
    //Create a constructor that accepts the hospital location, name and years since the last inspection as parameters.
    public Inspection(String place, String hospname, int years) {
        this.location = place;
        this.hospitalName = hospname;
        this.yearsSinceInspection = years;
    }
    //Use get methods for instance variables
    @Override
    public String getLocation() {
        return location;
    }
    @Override
    public String getHospitalName() {
        return hospitalName;
    }
    @Override
    public int getYearsSinceInspection() {
        return yearsSinceInspection;
    }
}