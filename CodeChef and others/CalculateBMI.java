import java.util.Scanner;
public class CalculateBMI {
    public static double calculateBMI(double weight, double height)
    {
        double bmi = (weight*703)/ height * height;
        return bmi;
    }
    public static String findStatus(double bmi){
        if (bmi < 18.5)
        {
            return "Underweight";
        }
        else if (bmi >= 18.5 && bmi < 24.9)
        {
            return "Normal";
        }
        else if (bmi >= 24.9 && bmi < 29.9)
        {
            return "Overweight";
        }
        else 
        {
            return "Obese";
        }
    }
    public static void main(String [] arg){
        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter Weight In Pounds ");
        double weight = user_input.nextDouble();
        System.out.println("Enter Height In Inches ");
        double height = user_input.nextDouble();
        double bmi = calculateBMI(weight, height);
        System.out.println(findStatus(bmi));
        
    }
}
