// There are two types of data types one primitive data types and non primitive data types
// primitive data types :: Which are already defined in java
// Non primitive data types :: Those data types which are defined by user
// static method means that we don't need to crearte class object to access method.
// Public means that method can be access outside the class
// Exception Handling 
//          An abnormal conditions that occurs on run time. 
//          A run time error
//          Exeption handling gives control of error handling at runtine
// syntax try{} catch {} catch {} ......... finally{}

import java.util.Scanner;
public class JavaBasics{
    public static void main(String arg[])
    {
        Scanner usr_input = new Scanner(System.in);
        int age;
        System.out.print("Please Enter your age. "); 
        age = usr_input.nextInt(); 
        usr_input.nextLine();
        System.out.print("Please Enter Your Name ");
        String name = usr_input.nextLine();
        System.out.println("Age:  "+ age);
        System.out.println("Name: "+ name);
        // int[] arr = new int[5];  // One Dimentional Array
        // int [][] arr = new int[5][5];   // Two Dimentional Array
        // for (int i = 0; i < 5; i++)
        // {
            // arr[i] += 5;     // It was for one Dimentional array
            // for (int j = 0; j < 5; j++)
            // {
            //     arr[i][j] += 10;
            //     System.out.println("Element in arr " + i + " " + arr[i][j]);
            // }
            
        // }
        System.out.print("Please Enter Number ");
        int num1 = usr_input.nextInt();
        System.out.print("Please Enter Number ");
        int num2 = usr_input.nextInt();
        // Method Calling
        System.out.println("The Average of numbers is " + Average(num1, num2));

        // Exeption Handling
        try
        {
            System.out.println(2/0);
        }
        // catch (ArithmeticException e)
        // {
        //     System.out.println("Error Accor ");
        //     System.out.println(e.getLocalizedMessage());
        // }

        // We can catch all kind of exception using Exception Keyword
        catch(Exception e)
        {
            System.out.println("Error Accor ");
            System.out.println(e.getLocalizedMessage());
        }
        System.out.println("Lines are executing correctly.");
    }

    static int Average(int num1, int num2)
    {
        int num3 = (num1+num2)/2;
        return num3;
    }
}