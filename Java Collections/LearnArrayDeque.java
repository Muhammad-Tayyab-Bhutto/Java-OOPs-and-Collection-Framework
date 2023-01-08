import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Scanner;

public class LearnArrayDeque{
    public static void main(String arg[])
    {
        Scanner user_input = new Scanner(System.in);
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        System.out.println("How many numbers you have. ");
        int limit = user_input.nextInt();
        // name.offer() and name.offerLast() use to add element at last.
        // name.offerFirst() use to add element at Head.
        // name.peek() and name.peekLast() use to remove element from last.
        // name.peekFirst() use to remove element from Head.
        // name.poll() and name.pollkLast() use to remove element from last.
        // name.pollFirst() use to remove element from Head.
        // we use contain mthod to search element from array.
        // clear() will clear all the array elements
        
        while (limit --> 0){
            int numbers = user_input.nextInt();
            adq.offer(numbers);
        }
        for (Integer i:adq){
            System.out.print(i + " ");
        }
        adq.offerFirst(99);
        Iterator it = adq.iterator();
        for(Integer i:adq){
            System.out.println("Printing using iterator " + i + " ");
        }
        // Removing Last Element
        adq.peekLast();
        adq.pollLast(); // Both will remove last element
        System.out.println("\n");
        for(Integer i:adq){
            System.out.println("Printing after removing last element " +i + " ");
        }
        System.out.println(adq.contains(55));
    }
}