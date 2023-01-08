class Person {
    private String firstName;
    private String lastName;
    public Person(){}   // default constructor 
    // two argument constructor
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void setFirstName(String first) {
        firstName = first; // should validate
    } // end method setFirstName
      // return first name

    public String getFirstName() {
        return firstName;
    } // end method getFirstName
      // set last name

    public void setLastName(String last) {
        lastName = last; // should validate
    } // end method setLastName
      // return last name

    public String getLastName() {
        return lastName;
    } // end method getLastName
      // set social security number
    
    public String toString(){
        return "First Name: " + firstName + " Last Name: " + lastName;
    }
}
class Employee extends Person {
    private double anualSalary;
    private int startedYear;
    private String insuranceNumber;
    public Employee(){} // default constructor
    // five argument constructor
    public Employee(String firstName, String lastName, double anualSalary, int startedYear, String insuranceNumber){
        super(firstName, lastName);
        this.anualSalary = anualSalary;
        this.startedYear = startedYear;
        this.insuranceNumber = insuranceNumber;
    }
    public void setAnualSalary(double anualSalary) {
        this.anualSalary = anualSalary; // should validate
    } // end method setAnualSalary
      // return Anual Salary

    public double getAnualSalary() {
        return anualSalary;
    } // end method getAnualSalary
      // set started year

    public void setStartedYear(int startedYear) {
        this.startedYear = startedYear;// should validate
    } // end method setLastName
      // return Started Year

    public int getStartedYear() {
        return startedYear;
    } // end method getStartedYear
    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;// should validate
    } // end method setInsuranceNumber
      // return Insurance Number

    public String getInsuranceNumber() {
        return insuranceNumber;
    } // end method getInsuranceNumber
    public boolean isEqual(Employee e1, Employee e2){
        if (e1.insuranceNumber.equals(e2.insuranceNumber)){
            return true;
        }
        return false;
    }
    public String toString(){
        return super.toString() + " Anual Salary: " + anualSalary + " Started Year: " + startedYear + " Insurance Number: " + insuranceNumber;
    }
}
public class EmployeeMain {
    public static void main(String[] args) {
        Person person1 = new Person("Muhammad Tayyab", "Bhutto");
        Person person2 = new Person();
        Employee employee1 = new Employee("Muhammad Tayyab", "Bhutto", 5000000, 2020, "pk20-0020-2003-3892");
        Employee employee2 = new Employee();
        person2.setFirstName("Faheem");
        person2.setLastName("Akhtar");
        employee2.setFirstName("Faheem Akhtar");
        employee2.setLastName("Rajput");
        employee2.setStartedYear(2002);
        employee2.setAnualSalary(20000000);
        employee2.setInsuranceNumber("pk20-0020-2003-4455");
        System.out.println("Person 01 " + person1.toString());
        System.out.println("Person 02 " + person2.toString());
        System.out.println("Employee 01 " + employee1.toString());
        System.out.println("Employee 02 " + employee2.toString());
    }
}
