import java.util.Scanner;
public class CodeChefSelfDefence {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner user_input = new Scanner(System.in);
		int t = user_input.nextInt();
		while (t-->0){
            int count = 0;
			int choice = user_input.nextInt();
			for (int i = 0; i < choice; i++)
            {
                int a = user_input.nextInt();
                if (a >= 10 && a <= 60)
                {
                    count++;
                }
            }
            System.out.println(count);
		}
	}
}
