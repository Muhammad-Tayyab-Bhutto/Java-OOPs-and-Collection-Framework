import java.util.Scanner;
public class BubbleSorting {
    static void Sort(int arr[]){
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Sorted Numbers: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[];
        System.out.print("How many numbers you have? ");
        int len = input.nextInt();
        arr = new int[len];
        System.out.print("Enter Numbers: ");
        for (int i = 0; i < len; i++){
            arr[i] = input.nextInt();
        }
        Sort(arr);
    }    
}
