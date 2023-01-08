package Packages;
public class Person {
    String name;
    int age;
    void setData(String name, int age) {
        this.name = name;
        this.age = age;
    } 
    void display(){
        System.out.println("Name " + name + " Age " + age);
    }
}
class Student extends Person {
    int id;
    void setData(String name, int age, int id) {
        super.setData(name, id);
        this.id = id;
    } 
    void display(){
        super.display();
        System.out.println("ID " + id);
    }
}
