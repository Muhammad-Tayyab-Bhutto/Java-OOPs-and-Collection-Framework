import java.util.Scanner;
public class CodeChefParrallelProcessing {
    public static void main(String arg[])
    {
        Scanner user_input = new Scanner(System.in);
        int t = user_input.nextInt();
        while(t-->0)
        {
            int x = user_input.nextInt();
            long[] arr1 = new long[x];
            long[] arr2 = new long[x];
            long sum = 0;
            for (int i = 0; i < x; i++)
            {
                arr1[i] = user_input.nextLong();
                sum += arr1[i];
                arr2[i] = sum;
            }
            long y = sum;
            for (int i = 0; i < x; i++){
                y = Math.min(Math.max(arr2[i], sum-arr2[i]), y);
            }
            System.out.println(y);
        }
        
    }
}
