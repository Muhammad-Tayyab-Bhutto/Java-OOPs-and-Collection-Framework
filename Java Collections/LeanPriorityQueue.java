// Priority queue is used to maintain min heap and max heap
import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Comparator;

public class LeanPriorityQueue {
    public static void main(String arg[])
    {
        Scanner user_input = new Scanner(System.in);
        // PriorityQueue<Integer> pq = new PriorityQueue<>();  // This will work in min heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());      // This will work as max heap
        System.out.println("How many numbers you have. ");
        int limit = user_input.nextInt();
        while (limit--> 0){
            int number = user_input.nextInt();
            // We can all of those fuctions which we have used in queue
            pq.offer(number);
        }
        for (Integer i:pq){
            System.out.print(i + " ");
        }
        // we can used two functions to remove element (Note: this will give first priority to lower element so first element will lower remove)
        int removednem = pq.peek();
    }
}
