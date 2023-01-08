import java.util.Scanner;

public class exercise01{
public static void main(String[] args) {
    Scanner user_input = new Scanner(System.in);
    System.out.println("Hello World!");
    int num1;
    double num2;
    num1 = user_input.nextInt();
    num2 = user_input.nextDouble();
    System.out.println(num2 + num1);

}

}