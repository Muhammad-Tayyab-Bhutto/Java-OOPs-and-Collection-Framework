class student {
    String name;
    int roll_no;
}

public class Practice2 {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "john";
        s1.roll_no = 15689;
        System.out.println("your name is " + s1.name);
        System.out.println("your roll number is " + s1.roll_no);
    }
}