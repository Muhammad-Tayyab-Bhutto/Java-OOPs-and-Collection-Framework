import java.util.Scanner;
import java.util.ArrayList;

public class lastDigit {
    public static int lastDigi()
    {
        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter number ");
        int num = user_input.nextInt();
        return num%10;
    }
    public static void main(String arg[])
    {
        System.out.println("last digit is " + lastDigi());
    }
    
}
