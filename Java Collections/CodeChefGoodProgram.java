import java.util.Scanner; 
public class CodeChefGoodProgram {
    static String func(float x)
    {
        return "Not Good";
    }
    static String func(int x)
    {
        return "Good";
    }
    public static void main(String arg[])
    {
        Scanner user_input = new Scanner(System.in);
        int t = user_input.nextInt();
        while(t--> 0){
            int x = user_input.nextInt();
            if (x/4 != x/4f)
            {
                System.out.println(func (x/4f));
            } 
            else
            {
                System.out.println(func (x/4));
            }
        }
    }
}
