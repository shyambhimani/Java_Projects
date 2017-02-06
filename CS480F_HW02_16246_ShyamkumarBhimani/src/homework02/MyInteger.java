/*
 * Student Info: Name=Shyamkumar Dhirajlal Bhimani, ID=16246
 * Subject:CS480 _HW01_Fall_2015
 * Author: Shyam
 * Filename: MyInteger.java
 * Date and Time: Oct 12, 2015 4:43:27 PM
 * Project Name: HomeWork02
 */
package homework02;


public class MyInteger {
    
    private int value;

    public MyInteger(int value) 
    {
    value = value;
    }

    public int getValue() 
    {
    return value;
    }

    public static boolean isEven(int x) 
    {
    if(x%2==0)
    {
        return true;
    }
    return false;
    }
    public static boolean isOdd(int x) 
    {
    if(x%2!=0)
    {
        return true;
    }
    return false;
    }
    

    public static boolean isPrime(int x) 
    {
        for (int i=2;i<=x/2;i++) 
        {
            if (x%i==0) 
            {
            return false;
            }
        }
        return true;
    }
    public boolean isOdd() 
    {
    return isOdd(value);
    }

    public boolean isPrime() 
    {
    return isPrime(value);
    }

    public boolean equals(int x) 
    {
    return (value == x);
    }

    public boolean equals(MyInteger x)
    {
    return equals(x.getValue());
    }


    public static boolean isEven(MyInteger x)
    {
    return x.isEven();
    }

    public static boolean isOdd(MyInteger x) 
    {
    return x.isOdd();
    }

    public static boolean isPrime(MyInteger x) 
    {
    return x.isPrime();
    }

    public boolean isEven() 
    {
    return isEven(value);
    }

    
    public static int parseInt(String p) {
    return Integer.parseInt(p);
    }

    public static int parseInt(char[] c) 
    {
    return parseInt(new String(c));
    }
    public void display()
    {
        System.out.println(this.value + " is even? " + isEven());
        System.out.println(this.value + " is odd? " + isOdd());
        System.out.println(value + " is prime? " + isPrime());
    	char[] c = {'2','8','5'};
        System.out.println(MyInteger.parseInt(c));
	String p = "4";
        System.out.println(MyInteger.parseInt(p));

        
    }
}


