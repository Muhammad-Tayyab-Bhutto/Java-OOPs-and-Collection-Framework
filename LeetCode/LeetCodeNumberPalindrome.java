// Note this algorithm is best in cpp
import java.util.*;
public class LeetCodeNumberPalindrome {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        ;
        // String str = Integer.toString(x);
        long temp = x, rev = 0;
        // for (int i = 0; i < str.length(); i++)
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            System.out.println(rev +" value of temp " + temp);
            temp /= 10;
        }
        return x == rev;
    }

    public static void main(String[] arg) {
        boolean c = isPalindrome(121);
        System.out.println(c);
    }
}
