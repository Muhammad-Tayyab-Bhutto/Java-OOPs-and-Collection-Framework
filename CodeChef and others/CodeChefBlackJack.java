import java.util.Scanner;
public class CodeChefBlackJack {
    public static void main(String arg[])
    {
        Scanner user_input = new Scanner(System.in);
        int tNumbers = user_input.nextInt();
        for (int i = 0; i < tNumbers; i++)
        {
            int aNumber = user_input.nextInt();
            int bNumber = user_input.nextInt();
            int k = 0;
            for (int j = 1; j <= 10; j++)
            {
                if (aNumber+bNumber+j == 21)
                {
                    k = j;
                }
            }
            if (k+aNumber+bNumber == 21)
            {
                System.out.println(k);
            }
            else{
                System.out.println(-1);
            }
        }
    }   
}
