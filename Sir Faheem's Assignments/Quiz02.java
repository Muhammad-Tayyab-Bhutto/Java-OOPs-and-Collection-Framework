import java.util.Scanner;
class Person{
    Scanner user_input = new Scanner(System.in);
    int id;
    String name;
    char gender;
    double age;
    Person(){
        id = 286;
        name = "Muhammad Tayyab";
        gender = 'm';
        age = 19;
    }
    Person(int id, String name, char gender, double age){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    Person(int id, String name){
        this.id = id;
        this.name = name;
    }
    void GetData(){
        System.out.print("Enter your id. ");
        id = user_input.nextInt();
        user_input.nextLine();
        System.out.print("Enter your name. ");
        name = user_input.nextLine();
        System.out.print("Enter your gender. ");
        gender = user_input.next().charAt(0);
        System.out.print("Enter your age. ");
        age = user_input.nextDouble();
    }
    void displayData(){
        System.out.println("ID. " + id);
        System.out.println("Name. " + name);
        System.out.println("Gender. " + gender);
        System.out.println("Age. " + age);
    }
    boolean compareAge(double age1, double age2){
        if (age1 == age2){
            return true;
        }
        else{
            return false;
        }
    }
}

public class Quiz02{
    public static void main(String arg[]){
        Scanner user_input = new Scanner(System.in);
        int id;
        String name;
        char gender;
        double age;
        Person person1 = new Person();
        Person person3 = new Person(455, "Muhammad Tayyab");
        person1.GetData();
        System.out.print("Enter your id. ");
        id = user_input.nextInt();
        user_input.nextLine();
        System.out.print("Enter your name. ");
        name = user_input.nextLine();
        System.out.print("Enter your gender. ");
        gender = user_input.next().charAt(0);
        System.out.print("Enter your age. ");
        age = user_input.nextDouble();
        person1.displayData();
        Person person2 = new Person(id, name, gender,age);
        person1.displayData();
        person2.displayData();
        person3.displayData();
        System.out.println("Age " + person2.compareAge(person1.age, person2.age));
    }
}
