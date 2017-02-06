/*
 * Student Info: Name=Shyamkumar Dhirajlal Bhimani, ID=16246
 * Subject:CS480 _HW01_Fall_2015
 * Author: Shyam
 * Filename: Question2c.java
 * Date and Time: Sep 23, 2015 1:09:56 PM
 * Project Name: CS480F_HW02_16246_ShyamkumarBhimani
 */

import java.util.*;
        
public class Question2c {
    
    public static void main (String args[]){
        
        Scanner sc=new Scanner (System.in);
        
        System.out.println("Please enter first number");
        
        int a=sc.nextInt();
        
        System.out.println("Please enter second number");
        
        int b=sc.nextInt();
        
        System.out.println(a/b);
        
        int c=a/b;
        
        int i=c;
        
        if( i<=99999){
            
            String s=new String();
            
            s=Integer.toString(i);
            
            String array[]=s.split("");
            
            for(int j=0;j<array.length;j++){
                
                System.out.print(array[j]);
                System.out.print("  ");
                
            
            }
        }
    }
}
