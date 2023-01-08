import java.util.Scanner;

public class BinarySearch {
    static int Search(int[] arr, int element, int beg, int end) {
        int mid = (beg + end) / 2;
        if (beg <= end) {
            if (element == arr[mid]) {
                return mid;
            } else if (element < arr[mid]) {
                return Search(arr, element, beg, mid - 1);
            } else {
                return Search(arr, element, mid + 1, end);
            }
        } else {
            return - 1;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.print("Enter element. ");
        int element = input.nextInt();
        int index = Search(arr, element, 0, arr.length-1);
        if (index == -1){
            System.out.println("element not found.");
        } else {
            System.out.println("element found on index " + index);
        }
    }
}
