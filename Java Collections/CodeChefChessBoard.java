import java.util.Scanner; 
public class CodeChefChessBoard {
    public static void main(String arg[])
    {
        Scanner user_input = new Scanner(System.in);
        int t = user_input.nextInt();
        while(t--> 0){
            int x1 = user_input.nextInt();
            int y1 = user_input.nextInt();
            int x2 = user_input.nextInt();
            int y2 = user_input.nextInt();
            int sumOfX = x1-x2;
            int sumOfY = y1-y2;
            if (sumOfX < 0)
            {
                sumOfX = -sumOfX;
            }
            if (sumOfY < 0)
            {
                sumOfY = -sumOfY;
            }
            System.out.println(Math.max(sumOfX, sumOfY));
        }
    }
}
