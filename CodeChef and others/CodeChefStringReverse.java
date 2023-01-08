import java.util.Scanner;
public class CodeChefStringReverse {
    public static void main(String arg[])
    {
        Scanner user_input = new Scanner(System.in);
        int tNumbers = user_input.nextInt();
        while (tNumbers-->0)
        {
            int count = 0;
            String str = user_input.nextLine();
            for(int j = (str.length()-1); j >= 0; j--)
            {
                System.out.println(str.charAt(j));
            }
            System.out.println(count);
        }
    }
}
