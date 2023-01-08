import javax.swing.border.StrokeBorder;

class Person {
    private String fname;
    private String lname;
    void setf_name(String fname){
        this.fname = fname;
    }
    String getf_name() {
        return fname;
    }
    void setl_name(String lname){
        this.lname = lname;
    }
    String getl_name() {
        return lname;
    }
    void displayDetails() {
        System.out.println("First Name " + fname);
        System.out.println("Last Name " + lname);
    }
}

class Student extends Person{
    private long id;
    private String teacherName;
    private String course;
    Student (String fname, String lname, int id, String teacherName, String course){
        super.setf_name(fname);
        super.setl_name(lname);
        this.id = id;
        this.teacherName = teacherName;
        this.course = course;
    }
    void displayDetails() {
        super.displayDetails();
        System.out.println("ID " + id);
        System.out.println("Course " + course);
        System.out.println("Teacher Name " + teacherName);
    }
}

class Teacher extends Person {
    float salary;
    Teacher(String fname, String lname, float salary){
        super.setf_name(fname);
        super.setl_name(lname);
        this.salary = salary;
    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("Salary " + salary);
    }
}
public class LabTask02 {
    public static void main(String[] args) {
        Student student1 = new Student("Muhammad", "Tayyab", 02321, "Faheem Aktar", "PF");
        Student student2 = new Student("Ali", "Raza", 02321, "Faheem Aktar", "PF");
        Teacher teacher1 = new Teacher("Faheem","Akhtar",500000);
        Teacher teacher2 = new Teacher("Faheem","Akhtar",500000);
        student1.displayDetails();
        student2.displayDetails();
        teacher1.displayDetails();
        teacher2.displayDetails();
    }    
}
