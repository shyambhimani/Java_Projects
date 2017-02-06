/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CS480F_HW03_16246_ShyamkumarBhimani;

/**
 *
 * @author Shyam
 */
public class Course implements Displayable{
    private String courseName;
    private int numUnits;
    
    public Course(String cn,int nu)
    {
        this.courseName = cn;
        this.numUnits = nu;
    }
    
    public String getCourseName()
    {
        return courseName;
    }
    
    public int getnumUnits()
    {
        return numUnits;
    }
    
    public void display()
    {
        System.out.println("Course Name is "+ courseName);
        System.out.println("Number of Units are "+ numUnits);
    }

}

