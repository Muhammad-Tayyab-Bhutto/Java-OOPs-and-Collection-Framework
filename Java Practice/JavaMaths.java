import java.lang.Math;
import java.util.Scanner;

public class JavaMaths {
    public static void main(String arg[]) {
        // Declaring the variables
        // int Vali = -1;
        // float Valf = .5f;

        // // Printing the values
        // System.out.println("Initial value of int  : " + Vali);
        // System.out.println("Initial value of int  : " + Valf);

        // // Use of .abs() method to get the absoluteValue
        // int Absi = Math.abs(Vali);
        // float Absf = Math.abs(Valf);

        // System.out.println("Absolute value of int : " + Absi);
        // System.out.println("Absolute value of int : " + Absf);
        // System.out.println("");

        // // Use of acos() method
        // // Value greater than 1, so passing NaN
        // double Acosi = Math.acos(60);
        // System.out.println("acos value of Acosi : " + Acosi);
        // double x = Math.PI;
        // System.out.println("The value of PI is .. " + x);
        // // Use of toRadian() method
        // x = Math.toRadians(x);
        // double Acosj = Math.acos(x);
        // System.out.println("acos value of Acosj : " + Acosj);

        // double f1 = 30.56, f2 = -56.34;
        // f1 =Math.floor(f1);
        // System.out.println("Floor value of f1 : "+f1);
 
        // f2 =Math.floor(f2);
        // System.out.println("Floor value of f2 : "+f2);
        // System.out.println("");
 
        // // Use of hypot() method
        // double p = 12, b = -5;
        // double h = Math.hypot(p, b);
        // System.out.println("Hypotenuse : "+h);
        // System.out.println("");
 
        // // Use of IEEEremainder() method
        // double d1 = 105, d2 = 2;
        // double r = Math.IEEEremainder(d1,d2);
        // System.out.println("Remainder : "+r);
        // System.out.println("");
         
        // // Use of log() method
        // double l = 10;
        // l = Math.log(l);
        // System.out.println("Log value of 10 : "+l);
        // int a1 = 5;
        // int b1 = 10;
        // int d = Math.max(a1,b1);
        // int mn = Math.min(a1, b1);
        // System.out.println("Max value is. " + d);
        // System.out.println("Minimum value is. " + mn);
        Scanner input = new Scanner(System.in);
        int min = 1, max = 10;
        double num = (Math.random() * (max - min) + min);
        int guessNum = (int)num;
        System.out.print("Please enter number to guess. ");
        int a = input.nextInt();
        if (a == guessNum){
            System.out.println("You won!");   
        }
        else{
            System.out.println("You Lost!");
            System.out.println("Number is. " + guessNum);
        }
        double rd = 99.999;
        System.out.println("Rounded number is. "+ Math.round(rd));

    }
}
