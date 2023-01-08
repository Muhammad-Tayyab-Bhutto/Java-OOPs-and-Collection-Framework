import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int[] arr;
        try{
            System.out.print("Enter Size Of Array: ");
            number = input.nextInt();
            arr = new int[number];
            
        } catch (NegativeArraySizeException e){
            System.out.println(e);
            System.out.print("Enter Again Size Of Array: ");
            number = input.nextInt();
            arr = new int[number];
        }
        finally{
            System.out.println("finally executed.");
        }
    }
}
