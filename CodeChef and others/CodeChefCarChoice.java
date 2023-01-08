import java.util.Scanner;
public class CodeChefCarChoice {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner user_input = new Scanner(System.in);
		int t = user_input.nextInt();
		while (t-->0){
            int x1 = user_input.nextInt();
			int y1 = user_input.nextInt();
			int x2 = user_input.nextInt();
			int y2 = user_input.nextInt();
            if (((float)y1/(float)x1) < (float)y2/(float)x1)
            {
                System.out.println(-1);
            }
            else if (((float)y1/(float)x1) == (float)y2/(float)x1)
            {
                System.out.println(0);
            }
            else 
            {
                System.out.println(1);
            }
		}
	}
}
