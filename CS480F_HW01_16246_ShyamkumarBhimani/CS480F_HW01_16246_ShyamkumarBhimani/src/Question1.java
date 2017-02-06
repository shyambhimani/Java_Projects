/*
 * Student Info: Name=Shyamkumar Dhirajlal Bhimani, ID=16246
 * Subject:CS480 _HW01_Fall_2015
 * Author: Shyam
 * Filename: Question1.java
 * Date and Time: Sep 23, 2015 12:24:00 AM
 * Project Name: CS480F_HW02_16246_ShyamkumarBhimani
 */

import java.util.Scanner;
        
public class Question1 {
    
    public static void main (String args[]){
        
        System.out.println("Please enter the height");
        
        Scanner x = new Scanner (System.in);
        int a=x.nextInt();
        
        System.out.println("Please entre width");
        
        int w=x.nextInt();
        
        System.out.println("Please enter Charecter");
 
        char c=x.next().charAt(0);
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<w;j++)
            {
                System.out.print(c);
            }
            System.out.println("\n");
        }
    }
}
            