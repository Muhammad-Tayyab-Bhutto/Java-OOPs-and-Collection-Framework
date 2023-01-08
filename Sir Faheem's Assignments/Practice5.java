import java.util.Scanner;

class Area {
    double length;
    double breadth;

    Area(double len, double bre) {
        length = len;
        breadth = bre;
    }

    void getdata() {
        System.out.println("your area is " + (length * breadth));
    }
}

public class Practice5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double l, b;
        System.out.println("gve me a length");
        l = sc.nextDouble();
        System.out.println("give me a breadth");
        b = sc.nextDouble();
        Area a1 = new Area(l, b);
        a1.getdata();
    }
}