import java.util.Scanner;
public class CodeChefTheProductMystery {
    public static void main(String arg[])
    {
        Scanner user_input = new Scanner(System.in);
        int tNumbers = user_input.nextInt();
        for (int i = 0; i < tNumbers; i++)
        {
            long bNumber = user_input.nextInt();
            long cNumber = user_input.nextInt();
            int k = 0;
            for (int j = 1; j < 10; j++)
            {
                if ((j*bNumber)%cNumber == 0)
                {
                    k = j;
                    break;
                }
            }
            System.out.println(k);
        }
    }
}
