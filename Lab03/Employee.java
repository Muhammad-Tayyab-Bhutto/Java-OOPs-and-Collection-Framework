class EmployeeInfo{
    String name;
    int year_of_joining;
    double salary;
    String address;
    EmployeeInfo(String name, int year_of_joining, double salary, String address){
        this.name = name;
        this.year_of_joining = year_of_joining;
        this.salary = salary;
        this.address = address;
    }
    void display(){
        System.out.println(name +"    " +year_of_joining+"    " +address);
    }
}

public class Employee{
    public static void main(String arg[]){
        EmployeeInfo e1 = new EmployeeInfo("Robert", 1994, 9999.2, "64C-WallsStreat");
        EmployeeInfo e2 = new EmployeeInfo("Sam", 2000, 5656.50, "68D-WallsStreat");
        EmployeeInfo e3 = new EmployeeInfo("John", 1999, 5656.56, "62B-WallsStreat");
        System.out.println("Name" +"     " +"year_of_joining"+"      " +"Address");
        e1.display();
        e2.display();
        e3.display();

    }
}
