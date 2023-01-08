import java.util.Scanner;
public class CodeChefShoppingChange {
    public static void main(String arg[])
    {
        Scanner user_input = new Scanner(System.in);
        int tNumbers = user_input.nextInt();
        for (int i = 0; i < tNumbers; i++)
        {
            int xNumber = user_input.nextInt();
            System.out.println(100-xNumber);
        }
    }
    
}
