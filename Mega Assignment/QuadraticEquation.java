import java.lang.Math;
import java.util.Scanner;
public class QuadraticEquation{
    static void quadraticEquation(double a, double b, double c){
        double firstRoot = 0, secondRoot = 0; 
        double determinent = (b*b)-(4*a*c);
        double squareRoot = Math.sqrt(determinent);
        if (determinent > 0){
            firstRoot = (-b + squareRoot) / (2 * a);
            secondRoot = (-b + squareRoot) / (2 * a);
            System.out.println("First Root is " + firstRoot + " and " + " Second Root is " + secondRoot);
        }
        else if (determinent == 0){
            System.out.println("Root is " + (-b + squareRoot) / (2 * a));
        }
        
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = input.nextInt();
        System.out.print("Enter value of b: ");
        int b = input.nextInt();
        System.out.print("Enter value of c: ");
        int c = input.nextInt();
        quadraticEquation(a, b, c);
    }
}