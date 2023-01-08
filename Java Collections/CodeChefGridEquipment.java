import java.util.Scanner;

public class CodeChefGridEquipment {
    public static void main(String arg[]) {
        Scanner user_input = new Scanner(System.in);
        int t = user_input.nextInt();
        int b = 1;
        if (t)
        {if (t%2 == 1)
        {
            System.out.println(-1);
        }
        else{
            for (int i = 0; i <= t*2; i++)
            {
                System.out.print(i +" "+ b++);
                System.out.println("\n");
            }
        }}
    }
}
