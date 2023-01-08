import java.util.Scanner;
public class CodeChefBatteryLow {
    public static void main(String arg[]){
        Scanner user_input = new Scanner(System.in);
        int t = user_input.nextInt();
        while (t--> 0)
        {
            int x = user_input.nextInt();
            if (x >= 0 && x <= 15)
            {
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}