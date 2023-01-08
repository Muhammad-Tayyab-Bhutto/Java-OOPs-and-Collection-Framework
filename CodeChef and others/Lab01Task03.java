import java.util.Scanner;
public class Lab01Task03 {

    public static void main(String [] abs){
        Scanner user_input = new Scanner(System.in);
        int a = user_input.nextInt();
        int b = user_input.nextInt(); 
        if (a> b){
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("b is greater than b");
        }
    }    
}

