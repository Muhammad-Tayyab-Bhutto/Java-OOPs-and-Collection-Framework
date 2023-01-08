// Set: it is combinationation of similar elements
// Note: here the arragement wil not be same because of hashing
// so if we want to arranged elements so we will use LishHashSet();
// and if we want unique elements but in sorted form so we will use TreeSet(); (Work as binary search tree)
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Set;
import java.util.Iterator;
import java.util.Scanner;
public class LearnSet {
    public static void main(String arg[]){
        // Set<Integer> numbers = new HashSet<>();  // this will not print element in arranged order as we have inserted
        // Set<Integer> numbers = new LinkedHashSet<>();  // this will print element in arranged order as we have inserted
        Set<Integer> numbers = new TreeSet<>();     // This will  print unique elements but in sorted form
        // isEmpty will return true or false on the basis of array conditions either it is empty or not
        numbers.add(45);
        numbers.add(45);
        numbers.add(4);
        numbers.add(415);
        numbers.add(452);
        numbers.add(451);
        numbers.add(450);
        numbers.add(45);
        for (Integer i:numbers)
        {
            System.out.println("The values of set are. " + i);
        }
        numbers.clear();
        System.out.println("Checking array is empty or not. "+numbers.isEmpty());
    }
}
