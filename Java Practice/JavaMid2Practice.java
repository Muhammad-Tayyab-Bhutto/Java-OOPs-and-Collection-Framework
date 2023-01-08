import javax.sound.sampled.SourceDataLine;

class A {
    int b = 9;
}
class B extends A{
    int a = 10;
}
class C extends B{
    int a = 11;
    void display(){
        System.out.println("a " + super.b);
    }
}
public class JavaMid2Practice {
    public static void main(String[] args) {
        C c = new C();
        c.display();
    }
}