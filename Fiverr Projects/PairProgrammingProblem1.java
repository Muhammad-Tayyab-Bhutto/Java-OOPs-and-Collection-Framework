import java.util.Scanner;

class Student extends Thread{
    @Override
    void run(){
        System.out.println("This is fitst.");
    }
}

class Sudent1 extends Thread{
    @Override
    void run(){
        System.out.println("This is second.");
    }
}
public class PairProgrammingProblem1 {
    public static void main(String arg[]){
        Scanner user_input = new Scanner(System.in);
        int tLines = user_input.nextInt();
            while (tLines -- >0){
            int qi = user_input.nextInt();
            int ti = user_input.nextInt();
            int xi = user_input.nextInt();
            int ni = user_input.nextInt();
        }
        
    }
}