// if we want to add in last so will use list

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class learnListt {
    public static void main(String arg[])
    {
        Scanner user_input = new Scanner(System.in);
        List<Integer> lst = new ArrayList<>();
        System.out.println("How many numbers you hava? ");
        int num = user_input.nextInt();
        while (num --> 0)
        { 
            int numbers = user_input.nextInt();
            lst.add(numbers);
        }

        // Printing element for each loop
        for (Integer i:lst){
            System.out.print(i +"  ");
        }
        // Printing element using iterator
        Iterator<Integer> it = lst.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next() +"  ");
        }
    }    
}
