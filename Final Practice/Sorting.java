import java.util.Arrays;

class Parent{
    private String name;

    Parent(String name){
        this.name = name;
    }

    public String toString(){
        return "Parent name: "+name;
    }
}



class Child extends Parent{
    private String name;

    Child(String name){
        super(name);
        this.name = name;
    }
    
    public String toString(){
        return super.toString().concat("Child name: "+name);
    }
}


public class Sorting {
    public static void main(String[] args) {
        // Parent parent =  new Parent("ALi Ahmed");
        Child child = new Child("Ammar Majeed");
        // System.out.println(parent);
        System.out.println(child);
    }    
}
