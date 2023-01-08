import java.util.Scanner;

public class Year {
    static double age(int year){
        int currentYear = 2022;
        return currentYear - year;
    }
    public static void main(String arg[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year in which you born. ");
        int year = input.nextInt();
        System.out.println("Your age is. " + age(year));
    }
    
}
