import java.util.Scanner;
public class OneDArrayProgram {
    public static void main(String arg[]){
        Scanner user_input = new Scanner(System.in);
        System.out.print("How many numbers you have? ");
        int size = user_input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++){
            arr[i] = user_input.nextInt();
        }
        for (int i:arr){
            System.out.print(i+ "  ");
        }
    }
}
