class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;
    void printSalay(){
        System.out.println("Salay: " + salary);
    }
    void displayData() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
    }
}
class Manager extends Member {
    Manager(String name, int age, String phoneNumber, String address, double salary) {
        super.name = name;
        super.age = age;
        super.address = address;
        super.phoneNumber = phoneNumber;
        super.salary = salary;
    }   
}
class Employee extends Member {
    Employee(String name, int age, String phoneNumber, String address, double salary) {
        super.name = name;
        super.age = age;
        super.address = address;
        super.phoneNumber = phoneNumber;
        super.salary = salary;
    }
}
public class Mid2Practice {
    public static void main(String[] args) {
        Manager manager = new Manager("Muhammad Tayyab", 19, "03093416858", "XYZ", 888888552.99);
        manager.displayData();
        manager.printSalay();
    }
}
