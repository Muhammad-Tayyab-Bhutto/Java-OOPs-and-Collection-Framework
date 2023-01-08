import java.util.Scanner;

public class BinarySearchRecursive {
    static int Search(int arr[], int element, int beg, int end){
        if (beg <= end){
            if ()
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.print("Enter element. ");
        int element = input.nextInt();
        if (Search(arr, element, 0, arr.length-1) == -1){
            System.out.println("element not found.");
        } else {
            System.out.println("element found on index " + Search(arr, element, 0, arr.length-1));
        }
    }
}
