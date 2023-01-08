class Person {
    int id;
    String name;
    Person(){
        id = 90;
        name = "Muhammad Tayyab";
    }
    Person(int id, String name){
        this.id = id;
        this.name = name;
    }
    Person(int id) {
        this.id = 90;
    }
    void getData(){
        System.out.println("Name. " + name);
        System.out.println("ID. " + id);
    }
    Person setData(Person obj){
        obj.id = 99;
        obj.name = "Muhammad Tayyab";
        return obj;
    } 

}

public class Inheritence {
    public static void main(String arg[]){
        Person person1 = new Person();
        Person person2 = new Person(425, "Muhammad Tayyab");
        Person person3 = new Person(45);
        Person person4 = new Person();
        System.gc();
        person1.getData();
        person2.getData();
        person3.getData();
        person4 = person1.setData(person2);
        person4.getData();
        // System.out.println(person4);
        
    }    
}
