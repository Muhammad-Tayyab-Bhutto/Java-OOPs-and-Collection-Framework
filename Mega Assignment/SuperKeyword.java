// Three usages of super Keyword
// Variable having same name in super class and in subclass 
// Method having same name in super class and in subclass
// Calling Constructor
class SuperClass {
    String name;
    SuperClass(String name){
        this.name = name;
    }
    void Display(){
        System.out.println("Name " + name);
    }
}
class SubClass extends SuperClass{
    String name;
    SubClass(String name){
        super(name);    // Super With Constructor
        name = super.name;  // Super With Variable Name
    }
    void Display(){
        super.Display();
    }
}
public class SuperKeyword {

    public static void main(String[] args) {
        SuperClass superClass = new SuperClass("Muhammad Tayyab Bhutto");
        System.out.println("before using super keyword.");
        superClass.Display();
        SubClass subClass = new SubClass("Muhammad Muzammil Bhutto");
        System.out.println("after using super keyword.");
        subClass.Display();
    }
}
