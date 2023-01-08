import java.util.Scanner;
public class Example{
	public static void main(String arg[]){
		Scanner user_input = new Scanner(System.in);
		int t = user_input.nextInt();
		while (t-->0){
			int a = user_input.nextInt();
			int b = user_input.nextInt();
			int c = user_input.nextInt();
			if ((b*1)+(c*2) >= a)
			{
				System.out.println("Qualify");
			}
			else
			{
				System.out.println("Not Qualify");
			}
		}
	}
}