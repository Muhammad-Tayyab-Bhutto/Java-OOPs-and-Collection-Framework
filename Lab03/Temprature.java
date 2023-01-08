import java.util.Scanner;

public class Temprature {
    static double tempraturConvertor(double celcius){
        double fahrenheit = 1.8 * celcius + 32;
        return fahrenheit;
    }
    public static void main(String arg[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value in celcius. ");
        double celcius = input.nextDouble();
        System.out.println("value in fahrenheit is. "+ tempraturConvertor(celcius));
    }
    
}
