/*
 * Student Info: Name=Shyamkumar Dhirajlal Bhimani, ID=16246
 * Subject:CS480 _HW01_Fall_2015
 * Author: Shyam
 * Filename: StudentGrade.java
 * Date and Time: Nov 17, 2015 2:38:05 PM
 * Project Name: HomeWork
 */
package CS480F_HW03_16246_ShyamkumarBhimani;


public class StudentGrade implements Displayable,GradeBookConstants{
    
    private String studentName;
    private int[] scores;
    private int numScores;
    
    public StudentGrade(String sn)
    {
        this.studentName = sn;
        scores = new int[MAX_HWS];
        numScores = 0;
    }
    
    public void display()
    {
        
        for(int i=0;i<numScores;i++)
        {
            System.out.println(i +" Score is "+scores[i]);
        }
        System.out.println("Student Name "+studentName);
    }
    
    public String getStudentName()
    {
        return studentName;
    }
    
    public void addScore(int s)
    {
        
            scores[numScores] = s;
            numScores++;
        
    }
    
    public double getScoreAverage()
    {
        
        double averageScore=0;
        int count=0;
        for(int i=0;i<numScores;i++)
        {
            averageScore += scores[i];
            count++;
        }
        return (double) averageScore/count;
    }
    
    public int getNumScores()
    {
        return numScores;
    }
}
    
 
