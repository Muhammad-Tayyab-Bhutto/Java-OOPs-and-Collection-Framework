import java.util.Scanner;

public class FibonacciSeries {
    static int Fibonacci(int numbers){
        if (numbers == 0){
            return numbers;
        }
        if (numbers == 1 || numbers == 2){
            return 1;
        }
        return (Fibonacci(numbers-1) + Fibonacci(numbers-2));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number. ");
        int number = input.nextInt();
        for (int i = 0; i < number; i++){
            System.out.print(Fibonacci(i) + " ");
        }
    }
}
