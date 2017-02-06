/*
 * Student Info: Name=Shyamkumar Dhirajlal Bhimani, ID=16246
 * Subject:CS480 _HW01_Fall_2015
 * Author: Shyam
 * Filename: Instructor.java
 * Date and Time: Nov 17, 2015 2:36:26 PM
 * Project Name: HomeWork
 */
package CS480F_HW03_16246_ShyamkumarBhimani;


public class Instructor implements Displayable{
    private String instructorName;
    private String department;
    
    public Instructor(String instructorName,String department)
    {
        this.department=department;
        this.instructorName=instructorName;
    }
    
    public void display()
    {
        System.out.println("Department Name is "+department);
        System.out.println("Instuctor Name is "+instructorName);
    }
}
    
    

