import java.util.Scanner;

public class EmployeeInfo {
    double salary;
    int numberOfHours;
    int workPerDay;
    void getInfo(double salary, int numberOfHours, int workPerDay){
        this.salary = salary;
        this.numberOfHours = numberOfHours;
        this.workPerDay = workPerDay;
    }
    void AddWork(){
        float hours = numberOfHours/workPerDay;
        if (hours < 6){
            System.out.println("Your Salary is. " + salary*workPerDay);
        }
        else if (hours > 6){
            System.out.println("Your Salary is. " + (salary*workPerDay)+5);
        }
        else{
            System.out.println("Sorry :/ ");
        }
    }
    public static void main(String arg[]){
        Scanner input = new Scanner(System.in);
        EmployeeInfo ei = new EmployeeInfo();
        double salary;
        int numberOfHours;
        int workPerDay;
        System.out.println("Enter your Salary.");
        salary = input.nextDouble();
        System.out.println("Enter your Number of Hours.");
        numberOfHours = input.nextInt();
        System.out.println("Enter your Work Per Day.");
        workPerDay = input.nextInt();
        ei.getInfo(salary, numberOfHours, workPerDay);
        ei.AddWork();

    }
}

