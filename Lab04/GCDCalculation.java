import java.util.Scanner;

public class GCDCalculation {
    static int gcdCalculation(int number1, int number2, int i) {
        if(number1 % i == 0 && number2 % i == 0)
        {
             return i;
        }

        else {
            return gcdCalculation(number1,number2,i-1);
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1. ");
        int number1 = input.nextInt();
        System.out.print("Enter number 2. ");
        int number2 = input.nextInt();
        int i = number2;
        System.out.println(gcdCalculation(number1, number2, i));
    }

}
