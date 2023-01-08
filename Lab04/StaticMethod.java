import java.util.*;

public class StaticMethod {
    public static int lastDigit(int num) {
        return num % 10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Enter a number: ");
        number = sc.nextInt();
        System.out.println(lastDigit(number));
    }
}
