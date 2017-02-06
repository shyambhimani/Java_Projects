/*
 * Student Info: Name=Shyamkumar Dhirajlal Bhimani, ID=16246
 * Subject:CS480 _HW01_Fall_2015
 * Author: Shyam
 * Filename: GradeBook.java
 * Date and Time: Nov 17, 2015 2:31:14 PM
 * Project Name: HomeWork
 */
package CS480F_HW03_16246_ShyamkumarBhimani;

import java.util.ArrayList;
import java.util.HashSet;

public class GradeBook implements Displayable,GradeBookConstants{
    private Instructor instructor;
    private String semester;
    private CourseGrade[] courseGrade;
    private int numCourseGrades;
    
    public GradeBook(Instructor i,String s)
    {
        this.instructor = i;
        this.semester = s;
        courseGrade = new CourseGrade[MAX_COURSES];
        numCourseGrades=0;
    }
    
    public void display()
    {
        
        for(int i=0;i<numCourseGrades;i++)
        {
            courseGrade[i].display();
        }
        instructor.display();
        System.out.println("Semester "+semester);
    }
    
    public void addCourseGrade(CourseGrade c)
    {
        courseGrade[numCourseGrades]=c;
        numCourseGrades++;
    }
    
    public CourseGrade getCourseGrade(String cn)
    {
        CourseGrade returnObject = null;
        for(int i=0;i<numCourseGrades;i++)
        {
            String compare = courseGrade[i].getCourse().getCourseName();
            if(compare.equals(cn))
            {
                returnObject = courseGrade[i];
            }
        }        
        return returnObject;
    }
    
    public void printEachCourseStudentWithPerfect10()
    {
        for(int i=0;i<numCourseGrades;i++)
        {
            String[] returnString = courseGrade[i].getStudentsWithPerfect10();
            for(int j=0;j<returnString.length;j++)
            {
                System.out.println("Student Name : "+returnString[j]);
            }
        }
    }
    
    public ArrayList<String> getAllStudentNames()
    {
        ArrayList<String> studentName = new ArrayList<String>();
        for(int i=0;i<numCourseGrades;i++)
        {
            StudentGrade[] u = courseGrade[i].getStudentGrades();
            for(int j=0;j< courseGrade[i].getNumStudentGrades();j++)
            {
                studentName.add(u[j].getStudentName());
            }
        }
        HashSet<String> n = new HashSet<String>(studentName);
        ArrayList<String> z = new ArrayList<String>(n);
        return z;
    }

    public Instructor getInstructor() {
        return instructor;
    }
    
    
}

    
    

