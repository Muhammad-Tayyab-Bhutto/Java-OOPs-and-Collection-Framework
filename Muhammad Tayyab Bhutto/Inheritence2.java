class A{
    A(){
        System.out.println("A");
    }
}
class B extends A{
    B(){
        System.out.println("B");
    }
}
class C extends B{
    C(){
        System.out.println("C");
    }
}
class D extends C{
    D(){
        System.out.println("D");
    }
}
public class Inheritence2 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
    }
}
