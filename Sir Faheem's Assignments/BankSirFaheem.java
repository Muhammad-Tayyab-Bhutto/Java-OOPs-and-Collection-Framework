import java.util.Scanner;

class Person {
    int id;
    String name;
    int cms;
    private String fname = "";

    Scanner input = new Scanner(System.in);

    Person(int id, String name, int cms) {
        System.out.println("ID :" + id);
        System.out.println("NAME:" + name);
        System.out.println("CMS :" + cms);
    }

    Person() {

    }
    
    String setDataName(String fname){
        this.fname = fname;
        return fname;
    }
    void setData() {
        id = input.nextInt();
        cms = input.nextInt();
        input.nextLine();
        name = input.nextLine();
    }

    void Display() {
        System.out.println("ID :" + id);
        System.out.println("NAME:" + name);
        System.out.println("CMS :" + cms);

    }
}

public class BankSirFaheem {
    public static void main(String a[]) {
        Person p1 = new Person(89, "Ahsan", 023125455);
        Person p2 = new Person();
        p2.setData();
        p2.Display();
        System.out.println(p2.setDataName("Muhammad Tayyab"));
        // p2.fname = "Muhammad Tayyab";
    }
}