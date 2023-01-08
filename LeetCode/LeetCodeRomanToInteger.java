import java.util.TreeMap;
import java.util.Map;
public class LeetCodeRomanToInteger {
    public int romanToInt(String s) {
        int total = 0;
        int val1 = 0, val2 = 0;

        for (int i = 0; i < s.length(); i++) {
            val1 = value(s.charAt(i));

            if (i + 1 < s.length()) {
                val2 = value(s.charAt(i + 1));
            }

            if (val1 >= val2) { // Test Case: 'VI' --> 5 + 1 = 6
                total += val1;
            } else { // Test Case: 'IX' --> 10 - 1 = 9
                total -= val1;
            }
        }
        return total;
    }

    // Return the integer value corresponding to the roman numeral
    public int value(char ch) {
        if (ch == 'I') {
            return 1;
        }
        if (ch == 'V') {
            return 5;
        }
        if (ch == 'X') {
            return 10;
        }
        if (ch == 'L') {
            return 50;
        }
        if (ch == 'C') {
            return 100;
        }
        if (ch == 'D') {
            return 500;
        }
        if (ch == 'M') {
            return 1000;
        } else {
            return -1;
        }
    }
    // public static void main(String[] arg){
    //     Map<String, Integer> roman = new TreeMap<>();
    //     int total = 0;
    //     int val1 = 0, val2 = 0;
    //     roman.put("I", 1);
    //     roman.put("V", 5);
    //     roman.put("X", 10);
    //     roman.put("L", 50);
    //     roman.put("C", 100);
    //     roman.put("D", 500);
    //     roman.put("M", 1000);
    //     System.out.println(roman);
    //     for (int i = 0; i < s.length(); i++){
    //         val1 = value(s.charAt(i));
    //         if (i + 1 < s.length()) {
    //             val1 = roman[s.charAt[i]];
    //         }

    //         if (val1 >= val2) { // Test Case: 'VI' --> 5 + 1 = 6
    //             total += val1;
    //         } else { // Test Case: 'IX' --> 10 - 1 = 9
    //             total -= val1;
    //         }
    //     }
    //     return total;
    //     }
    // }
}
