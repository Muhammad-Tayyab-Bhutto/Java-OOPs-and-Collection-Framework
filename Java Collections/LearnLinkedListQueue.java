// Queue is also called FIFI which means first in first out.
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class LearnLinkedListQueue {
    public static void main(String arg[])
    {
        Scanner user_input = new Scanner(System.in);
        Queue<Integer> ll = new LinkedList<>();
        // if we want to insert some element into the array so we will use offer function
        System.out.println("How many numbers you have? ");  
        int limit = user_input.nextInt();
        while (limit --> 0){
            int numbers = user_input.nextInt();
            ll.offer(numbers);
        }
        System.out.print("\n");
        for (Integer i:ll){
            System.out.print(i + " ");
        }

        // if we want to remove element from array so we will use poll and also it is return that element so we can also store it in any other variable 
        int removedele = ll.poll();
        System.out.println(removedele);
    }
}
