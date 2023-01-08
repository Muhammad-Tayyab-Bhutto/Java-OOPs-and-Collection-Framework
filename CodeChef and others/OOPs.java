// If we make a any data type static so it will be the property of class.
// means we can access static data types without creating objects.


import java.util.Scanner;
class Person{
    String name;
    int age;
    static int count = 0;
    public Person ()
    {
        count++;
        System.out.println("Creating an object. ");
    }
    public Person(String newName, int newAge)
    {
        // Using this keyword we can call constructor into constructor 
        this();     // Called constructor here
        age = newAge;
        name = newName;
    }
    // void Information(String name, int age)
    // {
    //     this.age = age;
    //     this.name = name;
    //     System.out.println("Hello! "+ name);
    //     System.out.println("Age "+ age);
    // }

    void Display()
    {
        System.out.println("Name " + name);
        System.out.println("Age "+ age);
    }
}
public class OOPs{
    public static void main(String arg[])
    {
        Person p1 = new Person();   // We are calling Constructor here so any thing which is in Constructo it will execute
        Person p2 = new Person("Muhammad Tayyab", 20);
        Scanner user_input = new Scanner(System.in);
        String name;
        int age;
        System.out.print("Please enter your name. ");
        name = user_input.nextLine();
        System.out.print("Please enter your age. ");
        age = user_input.nextInt();
        // p1.Information(name, age);
        p2.Display();
        System.out.println("Total Number of person are/is. " + Person.count);
    }
}