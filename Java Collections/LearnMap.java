import java.util.HashMap;
import java.util.TreeMap;
import java.util.Scanner;
import java.util.Map;

public class LearnMap {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        // Map<String, Integer> m = new HashMap<>();

        // if we use TreeMap inplace of HashMap so it it will be sorted in order to keys

        Map<String, Integer> m = new TreeMap<>();

        // if we want to assign element to map so we will used map function
        m.put("One", 1);
        m.put("Two", 2);
        m.put("Three", 3);
        // m.put("Three", 31); // This will override the value so the value Became 31

        // If we dont want to override the value so methods one using if and other using putIfAbsent method
        // if (!m.containsKey("Three")) {
        //     m.put("Three", 31);
        // }
        m.putIfAbsent("Three", 89);
        System.out.println(m);
        System.out.println(m.keySet());
        System.out.println(m.values());

        // Getting Iterator
        for(Map.Entry<String, Integer> e: m.entrySet())
        {
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // if we want to check key is preset or not so we will use constainsKey(); Method
        // System.out.println(m.constainsKey("Nine"));
        // // if we want to check value is preset or not so we will use constainsValue(); Method
        // System.out.println(m.constainsValue(45));

    }
}