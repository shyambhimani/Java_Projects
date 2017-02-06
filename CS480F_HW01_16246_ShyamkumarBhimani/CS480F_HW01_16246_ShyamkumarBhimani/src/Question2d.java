/*
 * Student Info: Name=Shyamkumar Dhirajlal Bhimani, ID=16246
 * Subject:CS480 _HW01_Fall_2015
 * Author: Shyam
 * Filename: Question2c.java
 * Date and Time: Sep 23, 2015 1:09:56 PM
 * Project Name: CS480F_HW02_16246_ShyamkumarBhimani
 */


import java.util.*;
        
public class Question2d {
    
    
    public static void main (String args[]){
        int flag;

        Scanner sc=new Scanner (System.in);
        
        System.out.println("Please enter the number between 0 and 99999");
       
        int a=sc.nextInt();
        
        if (a<99999){
            
                      
       
       while(a>0)
       {
           
           flag=a%10;
           System.out.print(flag + "   ");
           a = a/10;
       }
              
        }   
    }
}
