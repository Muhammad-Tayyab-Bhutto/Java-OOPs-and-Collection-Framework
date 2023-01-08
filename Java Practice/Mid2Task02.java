class Student {
    String name;
    Student(){
        System.out.println("No name found.");
    }
    Student(String name) {
        this.name = name;
    }
}
public class Mid2Task02 {
    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student("Muhammad Tayyab");
    }
}
