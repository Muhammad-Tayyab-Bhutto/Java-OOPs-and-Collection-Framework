import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchProgram {
    static Scanner scan = new Scanner(System.in);
    static double returnRatio(int n1, int n2, double r){        
        n1 = scan.nextInt();
        n2 = scan.nextInt();
        r = (double)(n1/n2);
        return r;
    }
    public static void main(String[] args) {
        int n1, n2;
        double r;
        
        try{
            n1 = scan.nextInt();
            n2 = scan.nextInt();
            r = (double)(n1/n2);
        }
        
        // catch (Exception e){
        //     System.out.println(e);
        // }                            // we can't do this if we do this will produce an error
        catch(ArithmeticException ae){
            System.out.println("Cannot be divided by 0");
            try{
                n1 = scan.nextInt();
                n2 = scan.nextInt();
                r = (double)(n1/n2);
            }
            finally{}
        }
        catch (InputMismatchException ime){
            System.out.println("You can only input numbers.");
            try{
                n1 = scan.nextInt();
                n2 = scan.nextInt();
                r = (double)(n1/n2);
            }
            finally{}
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
