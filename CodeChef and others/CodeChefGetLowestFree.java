import java.util.Scanner;
public class CodeChefGetLowestFree {
    public static void main(String arg[])
    {
        Scanner user_input = new Scanner(System.in);
        int tNumbers = user_input.nextInt();
        while(tNumbers-->0)
        {
            int aNumber = user_input.nextInt();
            int bNumber = user_input.nextInt();
            int cNumber = user_input.nextInt();
            if (aNumber > bNumber)
            {
                if (bNumber > cNumber)
                {
                    System.out.println(aNumber+bNumber);
                }
                else{
                    System.out.println(aNumber+cNumber);
                }
            }
            else
            {
                if (aNumber > cNumber)
                {
                    System.out.println(bNumber+aNumber);
                }
                else{
                    System.out.println(bNumber+cNumber);
                }
            }
        }
    }
}
