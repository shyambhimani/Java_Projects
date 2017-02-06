/*
 * Student Info: Name=Shyamkumar Dhirajlal Bhimani, ID=16246
 * Subject:CS480 _HW01_Fall_2015
 * Author: Shyam
 * Filename: Main.java
 * Date and Time: Nov 17, 2015 3:10:30 PM
 * Project Name: HomeWork
 */
package CS480F_HW03_16246_ShyamkumarBhimani;

import java.util.ArrayList;
public class Main {
    public static void main(String s[])
    {
        Instructor i =new Instructor("XYZ", "Computer Science");
        GradeBook gb = new GradeBook(i, "Fall 2014");
        
        gb.addCourseGrade(new CourseGrade(new Course("CS500", 3)));
        gb.addCourseGrade(new CourseGrade(new Course("CS501", 3)));
        
        gb.getCourseGrade("CS500").addStudentGrade(new StudentGrade("abc"));
        gb.getCourseGrade("CS500").addStudentGrade(new StudentGrade("def"));
        gb.getCourseGrade("CS500").addStudentGrade(new StudentGrade("ghy"));
        gb.getCourseGrade("CS500").addStudentGrade(new StudentGrade("syz"));

        gb.getCourseGrade("CS500").addStudentScore("abc", 10);
        gb.getCourseGrade("CS500").addStudentScore("def", 9);
        gb.getCourseGrade("CS500").addStudentScore("ghy", 8);
        gb.getCourseGrade("CS500").addStudentScore("syz", 6);

        gb.getCourseGrade("CS501").addStudentGrade(new StudentGrade("fds"));
        gb.getCourseGrade("CS501").addStudentGrade(new StudentGrade("rew"));
        gb.getCourseGrade("CS501").addStudentGrade(new StudentGrade("ter"));

        gb.getCourseGrade("CS501").addStudentScore("fds", 10);
        gb.getCourseGrade("CS501").addStudentScore("rew", 10);
        gb.getCourseGrade("CS501").addStudentScore("tre", 10);     
        

        ArrayList<String> name = gb.getAllStudentNames();
        for(int in=0;in<name.size();in++)
        {
            System.out.println(name.get(in));
        }


        gb.printEachCourseStudentWithPerfect10();
        System.out.println("Average CS500 Course Score is "+gb.getCourseGrade("CS500").getCourseAverage());
        
       gb.display();

    }
}

    

