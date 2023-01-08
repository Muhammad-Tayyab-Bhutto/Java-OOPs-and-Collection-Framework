import java.util.Scanner;
public class LinearSearch {
    static int Search(int number){
        int arr[] = {1,2,3,45,5,4,6,7,8,9,10};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numner you want to search. ");
        int searchingNumber = input.nextInt();
        if (Search(searchingNumber) == -1){
            System.out.println("Not found.");
        }
        else{
            System.out.println("Element found at index " + Search(searchingNumber));
        }
    }
}
