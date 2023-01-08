class Triangle
{
    double side1=3,side2=4,side3=5;
    Triangle(){
        double area,perimeter;
        area = side1+side2+side3;
        perimeter = 2*(side1+side2+side3);
        System.out.println("the area of triangle is "+area);
        System.out.println("the perimeter of triangle is"+perimeter);
    }
    
}

public class AreaProgram {
    public static void main(String arg[]){
        Triangle t1 = new Triangle();
        
    }
    
}
