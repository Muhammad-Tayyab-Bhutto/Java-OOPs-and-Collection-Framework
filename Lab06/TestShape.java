class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point point) {
        return Math.sqrt((x - point.getX()) * (x - point.getX()) + (y - point.getY()) * (y - point.getY()));
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public String toString() {
        return "(x: " + x + ", y: " + y + ")";
    }
}

abstract class Shape {
    private Point point;

    public Shape(Point point) {
        this.point = point;
    }

    Point getCenter() {
        return point;
    }

    public abstract boolean contains(Point point);

    public String toString() {
        return "Center(" + point + ")";
    }
}

class Circle extends Shape {
    private int radius;

    public Circle(int radius, Point point) {
        super(point);
        this.radius = radius;
    }

    int getRadius() {
        return radius;
    }

    public String toString() {
        return "Center of Circle(x: " + radius + ", y: " + super.getCenter() + ")";
    }

    public boolean contains(Point point) {
        double distance = point.distanceTo(super.getCenter());
        if (distance <= radius) {
            return true;
        }
        return false;
    }
}

class Rectangle extends Shape {
    private int length;
    private int width;
    private double point;

    Rectangle(int length, int width, Point point) {
        super(point);
        this.length = length;
        this.width = width;
    }

    public String toString() {
        return ("Rectangle(length: " + length + ", width: " + width + ", " + super.toString() + ")");
    }

    public boolean contains(Point point) {
        double distance = point.distanceTo(super.getCenter());
        double horizontalDistance = width / 2;
        double verticalDistance = length / 2;
        if (horizontalDistance <= distance && verticalDistance <= distance) {
            return true;
        }
        return false;
    }
    void displayAllRectangles(){
        System.out.println("Rectangle Information (length: " + length + ", width: " + width + ", " + super.toString() + ")");
    }
}

class ShapeArray {
    private Shape shapeList[];
    private int nbShapes;
    private Shape newShapeList[];
    ShapeArray(int size) {
        shapeList = new Shape[size];
        nbShapes = 0;
    }

    boolean addShape(Shape shape) {
        if (nbShapes != shapeList.length) {
            shapeList[nbShapes++] = shape;
            return true;
        }
        return false;
    }

    public int getCircleCounter() {
        int count = 0;
        for (Shape shape : shapeList) {
            if(shape instanceof Circle){
            // if (shape.getClass().getSimpleName().equals("Circle")) {         cann't run this because this create a nullPointer exception
                count++;
            }
        }
        return count;
    }
    Shape[] removeAllRecangle(){
        newShapeList = new Shape[shapeList.length-1];
        int k = 0;
        int indexOfRectangles = 0;
        for (Shape shape : shapeList) {
            if (shape instanceof Rectangle){
                continue;
            } else {
                newShapeList[k++] = shapeList[indexOfRectangles];
            }
            indexOfRectangles++;
        }
        return newShapeList;
    }
    double getAverageofAllShapes(){
        double averageofAllShapes = shapeList.length / nbShapes;
        return averageofAllShapes;
    }
}

public class TestShape {
    public static void main(String[] args) {
        ShapeArray shapes = new ShapeArray(20);
        shapes.addShape(new Circle(15, new Point(5, 5)));
        shapes.addShape(new Rectangle(5, 10, new Point(5, 5)));
        shapes.addShape(new Rectangle(5, 10, new Point(5, 5)));
        shapes.addShape(new Circle(15, new Point(5, 5)));
        shapes.addShape(new Circle(15, new Point(5, 5)));
        shapes.addShape(new Circle(15, new Point(5, 5)));
        Rectangle rectangle = new Rectangle(5, 10, new Point(5, 5));
        rectangle.displayAllRectangles();
        System.out.println("Number of Circles: " + shapes.getCircleCounter());
        shapes.removeAllRecangle();
        System.out.println("Average of All Shapes is " + shapes.getAverageofAllShapes());
    }
}