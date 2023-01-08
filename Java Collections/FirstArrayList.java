// ArrayList is slow then linked list so we can use Linked list inplace of array
// Both has same function like add, remove and other.
import java.util.Scanner;
import java.util.ArrayList;

public class FirstArrayList {
    public static void main(String arg[])
    {
        Scanner user_input = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        System.out.print("How many names you have? ");
        int num = user_input.nextInt();
        for (int i = 0; i < num; i++){
            user_input.nextLine();
            arr.add(user_input.nextLine());
        }
        for (int i = 0; i < num; i++){
            System.out.println(arr.get(i));
        }
    }
}
