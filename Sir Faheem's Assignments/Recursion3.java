import java.util.Scanner;

public class Recursion3 {
    static int powerFuction(int number, int power){
        if (power == 0){
            return 1;
        }
        else {
            return number * powerFuction(number, power - 1);
        }
    }
    public static void main(String arg[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number. ");
        int number = input.nextInt();
        System.out.println("Enter Power. ");
        int power = input.nextInt();
        System.out.println(powerFuction(number, power));
    }    
}
