/*
 * Student Info: Name=Shyamkumar Dhirajlal Bhimani, ID=16246
 * Subject:CS480 _HW01_Fall_2015
 * Author: Shyam
 * Filename: Question2.java
 * Date and Time: Oct 16, 2015 8:03:19 PM
 * Project Name: HomeWork02
 */

package homework02;

import java.util.Scanner;

public class Question1 {
    public static int findLargestBlock(int m[][]){
        
        int result[][] = new int[m.length][m[0].length];
        
        for(int i=0; i < m.length; i++){
            result[i][0] = m[i][0];
        }
        
        for(int i=0; i < m[0].length; i++){
            result[0][i] = m[0][i];
        }
        int i,j;
        int max = 1;
        
        
        for(i=1; i < m.length; i++){
            for(j=1; j < m[i].length; j++){
                if(m[i][j] == 0){
                    continue;
                }
                int t = min(result[i-1][j],result[i-1][j-1],result[i][j-1]);
                result[i][j] =  t +1;
                if(result[i][j] > max){
                    max = result[i][j];
                }
            }
        }
        return max;
    }
    private static int min(int a,int b, int c){
        int l = Math.min(a, b);
        return Math.min(l, c);
    }
   public static void main(String args[]){
       System.out.println("enter value:");
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       {
        
        int arr[][] = { {0,0,0,0,1},{0,0,0,1,0},{1,0,1,1,1},{1,0,1,1,1},{0,0,1,1,1}};
       
        int result = findLargestBlock(arr);
        System.out.println("The Matrix is:");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]);
                System.out.print("");
            }
            System.out.println("");
         }
        System.out.print("The maximum square submatrix size: " + result);
       }
        System.out.println("\n");
    }
}
