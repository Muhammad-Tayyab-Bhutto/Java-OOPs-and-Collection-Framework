import java.util.Scanner;

class Person{
    int id;
    String name;
    char gender;
    double age;
    void setData(int id, String name, char gender, double age){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
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

public class Quiz01{
    public static void main(String arg[]){
        Scanner user_input = new Scanner(System.in);
        int id;
        String name;
        char gender;
        double age;
        Person person1 = new Person();
        Person person2 = new Person();
        System.out.print("Enter your id. ");
        id = user_input.nextInt();
        user_input.nextLine();
        System.out.print("Enter your name. ");
        name = user_input.nextLine();
        System.out.print("Enter your gender. ");
        gender = user_input.next().charAt(0);
        System.out.print("Enter your age. ");
        age = user_input.nextDouble();
        System.out.print("Enter your id. ");
        id = user_input.nextInt();
        user_input.nextLine();
        System.out.print("Enter your name. ");
        name = user_input.nextLine();
        System.out.print("Enter your gender. ");
        gender = user_input.next().charAt(0);
        System.out.print("Enter your age. ");
        age = user_input.nextDouble();
        person1.setData(id, name, gender,age);
        person1.displayData();
        person2.setData(id, name, gender,age);
        person2.displayData();
        System.out.println("Age " + person2.compareAge(person1.age, person2.age));
    }
}