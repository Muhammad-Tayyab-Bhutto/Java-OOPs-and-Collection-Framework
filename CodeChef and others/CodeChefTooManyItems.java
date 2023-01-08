import java.util.Scanner;
public class CodeChefTooManyItems {
    public static void main(String arg[])
    {
        Scanner user_input = new Scanner(System.in);
        int tNumbers = user_input.nextInt();
        for (int i = 0; i < tNumbers; i++)
        {
            int xNumber = user_input.nextInt();
            if (xNumber%10 == 0)
            {
                System.out.println((xNumber/10));
            }
            else 
            {
                System.out.println(((xNumber/10)+1));
            }
        }
    }
}
