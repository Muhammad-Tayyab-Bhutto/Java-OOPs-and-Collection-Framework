import java.util.Scanner;

public class CalculateBMI{
    static double calcluateBMI(double weight, double height) 
    {
        double bmi = weight*703/(height*height);
        return bmi;
    }
    static String findStatus(double bmi){
        if (bmi > 0 && bmi < 18.5){
            return "UnderWeight";
        }
        else if (bmi > 18.5 && bmi < 24.9){
            return "Normal";
        }
        else if (bmi > 25.0 && bmi < 29.9){
            return "OverWeight";
        }
        else if (bmi > 29.9){
            return "Obese";
        }
        else {
            return "Invalid";
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds. ");
        double weight = input.nextDouble();
        System.out.print("Enter weight in inches. ");
        double height = input.nextDouble();
        double bmi = calcluateBMI(weight, height);
        System.out.println(findStatus(bmi));

    }
}