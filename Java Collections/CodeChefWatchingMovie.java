import java.util.Scanner;
public class CodeChefWatchingMovie {
    public static void main(String arg[])
    {
        Scanner user_input = new Scanner(System.in);
        int x = user_input.nextInt();
        int y = user_input.nextInt();
        int s1 = y/2;
        int s2 = x - y;
        System.out.println(s1+s2);
        
    }
}
