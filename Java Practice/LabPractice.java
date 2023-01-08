// public class LabPractice {
//     public static void main(String arg[]) {
//         String str = "This is Muhammad Tayyab Bhutto";
//         int count = 0;
//         int charCount = 0;
//         int temp = 0;
//         for (int i = 0; i < str.length()-1; i++) {
//             count++;
//         }
//         for (char ch = 'a'; ch <= 'z'; ch++) {

//         }
//     }
// }

import java.util.Scanner;

class LabPractice {
    public static boolean exist(char c, String s) {
        for (int i = 0; i < s.length(); i++) {
            if (c == s.charAt(i))
                return true;
        }
        return false;
    }

    public static int count(char c, String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (c == s.charAt(i))
                count++;
        }
        return count;
    }

    public static void main(String agrs[]) {
        String str = "My name is Avinash kumar I hope you are fine";
        String str1 = "";
        int k = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (i == 0) {
                str1 = str.charAt(i) + "";
                System.out.println("max " + str.charAt(i) + " =" + count(str.charAt(i), str));
            } else if (!exist(str.charAt(i), str1)) {
                str1 += str.charAt(i) + "";
                System.out.println("max " + str.charAt(i) + " =" + count(str.charAt(i), str));
            }
        }

    }
}
