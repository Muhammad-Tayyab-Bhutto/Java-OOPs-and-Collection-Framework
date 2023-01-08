import java.util.Scanner;

class Area{
    double length;
    double breath;
    void setDim(double len, double bre){
        length = len;
        breath = bre;
    }
    void getArea(){
        System.out.println("your area is " + length * breath);
    }
}
class Practice{
    public static void main(String[] arg){
        Scanner userInput = new Scanner(System.in);
        Area a1 = new Area();
        double l;
        l = userInput.nextDouble();
        double b;
        b = userInput.nextDouble();
        a1.setDim(l, b);
        a1.getArea();
    }
}
