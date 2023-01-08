class Person{
    int id;
    String name;
    char gender;
    Person(){
        System.out.println("Person");
        id = 123;
        name = "Muhammad Tayyab";
        gender = 'm';
    }
    void setData (int id, String name, char gender ){
        System.out.println("Set Data of Person");
        this.id = id;
        this.name = name;
        this.gender = gender;
    }
    void displayData(){
        System.out.println("id " + id);
        System.out.println("name " + name);
        System.out.println("gender " + gender);
    }
}

class Student extends Person{
    int sid;
    String dept;
    Student(){
        System.out.println("Student");
        sid = 345;
        dept = "CS";
    }
    // void setData (int id, String name, char gender, int sid, String dept){
    //     System.out.println("Set Data of Student ");
    //     this.id = id;
    //     this.name = name;
    //     this.gender = gender;
    //     this.sid = sid;
    //     this.dept = dept;
    // }
    // void displayData(){
    //     System.out.println("id " + id);
    //     System.out.println("name " + name);
    //     System.out.println("gender " + gender);
    //     System.out.println("sid " + sid);
    //     System.out.println("dept " + dept);
    // }
    void setData (int sid, String dept){
        System.out.println("Set Data of Student ");
        super.setData(id, name, gender);
        this.sid = sid;
        this.dept = dept;
    }
    void displayData(){
        super.displayData();
        System.out.println("sid " + sid);
        System.out.println("dept " + dept);
    }
}
public class Inheritence {
    public static void main(String arg[]){
        Person p1 = new Person();
        Student s1 = new Student();
        // p1.displayData();
        s1.setData(156, "Muhammad Tayyab Bhutto :) ", 'm');
        s1.displayData();
    }
}