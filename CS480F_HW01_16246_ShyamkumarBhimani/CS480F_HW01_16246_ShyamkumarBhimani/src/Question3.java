/*
 * Student Info: Name=Shyamkumar Dhirajlal Bhimani, ID=16246
 * Subject:CS480 _HW01_Fall_2015
 * Author: Shyam
 * Filename: Question3.java
 * Date and Time: Sep 28, 2015 6:57:43 PM
 * Project Name: CS480F_HW02_16246_ShyamkumarBhimani
 */


import java.util.*;
public class Question3 {
    
    public static boolean flip() {
        String choose[]={"1","2"};
        int size=choose.length;
        int rand=(int) (Math.random()*size);
        boolean result = false; 
        String num = choose[rand];
        if(num == "1") 
        {
            result=true;
        }
            return result;
    
    }
    public static void main(String args[]) {
        
       int x=0;
        while(x!=-1)
        {
            System.out.println("Enter number of times you want to TOSS the coin  or  -1 to Exit:");
            Scanner sc=new Scanner(System.in);
            x=sc.nextInt();
            System.out.println();

            int heads=0;
            int tails=0;
            int i=0;
            while(i<x)
                {
                if(flip())
                    {
                    heads++;
                    i++;
                    }   
                else
                    {
                        tails++;
                        i++;
                    }
                }
            if(x>0)
                System.out.println(heads + " Heads " + tails + " Tails ");
                System.out.println();

        }
        return;
    }
}