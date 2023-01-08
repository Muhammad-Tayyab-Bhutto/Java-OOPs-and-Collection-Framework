import javax.print.attribute.SetOfIntegerSyntax;

abstract class Fruit {
    abstract void displayFruit();
}

class Apple extends Fruit {
    private int a;
    int b;
    void setA(int a) {
        this.a = a;
    }
    int getA(){
        return a;
    }
    void display() {
        a=10;
        System.out.println("Apple");
    }
    void displayFruit(){
        System.out.println("Apple");
    }
}

class Orange extends Apple{
    int a = 10;
    void displayA(int a){
        super.setA(a);
    }
    void display(){
        a=10;
        System.out.println("Orange");
    }
}

public class MultilevelInheritence {
    public static void main(String argu[]) {
        Apple apple = new Orange();
        // apple.displayA();

    }
}
