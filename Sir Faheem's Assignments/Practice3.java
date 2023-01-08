import java.util.Scanner;
class Rectangle{
    double length;
    double breath;
    Rectangle(double len, double bre){
        length = len;
        breath = bre;
    }
    double Area(){
        return length * breath;
    }

}
public class Practice3 {
    public static void main(String arg[]){
        Scanner userInput = new Scanner(System.in);
        Rectangle r1 = new Rectangle(4, 5);
        double l;
        l = userInput.nextDouble();
        double b;
        b = userInput.nextDouble();

        Rectangle r2 = new Rectangle(l, b);
        System.out.println("The area1 of rectangle is"+r1.Area());
        System.out.println("The area2 of rectangle is"+r2.Area());
    }
}
