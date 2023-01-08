import java.util.Scanner;
public class Lab01Task02 {
    public static void main(String [] abs){
        Scanner user_input = new Scanner(System.in);
        double a = user_input.nextInt(); 
        double b = user_input.nextInt();
        int c = 5;
        double d = 3.9;
        c = d; 
        int e = (int)a/(int)b;
        System.out.println(c);
    }    
}