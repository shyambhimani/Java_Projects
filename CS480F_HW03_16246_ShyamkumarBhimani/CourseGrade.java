/*
 * Student Info: Name=Shyamkumar Dhirajlal Bhimani, ID=16246
 * Subject:CS480 _HW01_Fall_2015
 * Author: Shyam
 * Filename: CourseGrade.java
 * Date and Time: Nov 17, 2015 2:58:41 PM
 * Project Name: HomeWork
 */
package CS480F_HW03_16246_ShyamkumarBhimani;

import java.util.Arrays;

public class CourseGrade implements Displayable,GradeBookConstants{
    private Course course;
    private StudentGrade[] studentGrades;
    private int numStudentGrades;
    
    public CourseGrade(Course c)
    {
        this.course = c;
        studentGrades = new StudentGrade[MAX_STUDENTS];
        numStudentGrades= 0;
    }
    
    public void addStudentGrade(StudentGrade sg)
    {
        studentGrades[numStudentGrades]=sg;
        numStudentGrades++;    
    }
    
    @Override
    public void display()
    {
        
        for(int i=0;i<numStudentGrades;i++)
        {
            studentGrades[i].display();
        }
        course.display();
    }
    
    public void addStudentScore (String sn, int s)
    {
        for(int i=0;i<numStudentGrades;i++)
        {
            if(studentGrades[i].getStudentName().equals(sn))
            {
                studentGrades[i].addScore(s);
                break;
            }
        }
    }
    
    public Course getCourse()
    {
        return course;
    }
    
    public double getCourseAverage()
    {
        double ca=0;
        int count=0;
        for(int i=0 ; i<numStudentGrades ;i++)
        {
                ca += studentGrades[i].getScoreAverage();
                count++;
        }
        return (double) ca/count;
    }

    public StudentGrade[] getStudentGrades() {
        return studentGrades;
    }

    public int getNumStudentGrades() {
        return numStudentGrades;
    }
    
    public String[] getStudentsWithPerfect10()
    {
        String[] perfectStudent = new String[numStudentGrades];
        int count=0;
        for(int i=0;i<numStudentGrades;i++)
        {
            if(studentGrades[i].getScoreAverage() == 10)
            {
                perfectStudent[count]= studentGrades[i].getStudentName();
                count++;
            }
        }
        return Arrays.copyOf(perfectStudent, count);
    }
}

    

