// Stack is also called LEFO means last in first out 

import java.util.Stack;
import java.util.Iterator;
import java.util.Scanner;
public class LearnStack {
    public static void main(String arg[]){
        Scanner user_input = new Scanner(System.in);
        Stack<Integer> item = new Stack<>();
        // for add number we will use push function
        System.out.println("How many numbers you have? ");
        int limit = user_input.nextInt();
        while (limit--> 0)
        {
            int numbers = user_input.nextInt();
            item.push(numbers);
        }
        Iterator it = item.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next() +"  ");
        }

        // if we want to remove last element from array so we will pop
        item.pop();
        System.out.print("\n");
        for (Integer i : item)
        {
            System.out.print(i +"  ");
        }
    }
}
