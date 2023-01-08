class Employee {
    private String firstName;
    private String lastName;
    private String nationalIdCardNumber;
    Employee () {

    }
    Employee(String firstName, String lastName, String nationalIdCardNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalIdCardNumber = nationalIdCardNumber;
    }
    void setFirstName(String firstName){
        this.firstName = firstName;
    }
    String getFirstName(){
        return firstName;
    }
    void setLastName(String lastName){
        this.lastName = lastName;
    }
    String getLastName(){
        return lastName;
    }
    void setNationalIdCardNumber(String nationalIdCardNumber){
        this.nationalIdCardNumber = nationalIdCardNumber;
    }
    String getNationalIdCardNumber(){
        return nationalIdCardNumber;
    }
    String tostring() {  
        return firstName+ " " + lastName + "CNIC" + nationalIdCardNumber;  
    }
    double earnings(){
        return 0.0;
    }   
}

class SalariedEmployee extends Employee {
    private double weeklySalaried;
    SalariedEmployee(){

    }
    SalariedEmployee (String firstName, String lastName, String nationalIdCardNumber, double weeklySalaried) {
        super(firstName, lastName, nationalIdCardNumber);
        this.weeklySalaried = weeklySalaried;
    }
    void setWeeklySalaried(double weeklySalaried) {
        this.weeklySalaried = weeklySalaried;
    }
    double weeklySalaried(double weeklySalaried) {
        return weeklySalaried;
    }
    String tostring(){
        return super.tostring() + " " + weeklySalaried;
    }
    double earnings() {
        if (weeklySalaried >= 0.0){
            return weeklySalaried;
        }
        else {
            return 0.0;
        }
    }
    
}

class HourlyEmployee extends Employee {
    private double wage;
    private int hours;
    HourlyEmployee() {}
    HourlyEmployee(String firstName, String lastName, String nationalIdCardNumber, double wage, int hour){
        super(firstName, lastName, nationalIdCardNumber);
        if (wage >= 0) {
            this.wage = wage;
        }
        else {
            this.wage = 0.0;
        }
        if (hours >= 0) {
            this.hours = hours;
        }
        else {
            this.hours = 0;
        }
    }
    void setWage(double wage) {
        if (wage >= 0) {
            this.wage = wage;
        }
        else {
            this.wage = 0.0;
        }
    }
    double getWage(){
        return wage;
    }
    void setHours(int hours) {
        if (hours >= 0) {
            this.hours = hours;
        }
        else {
            this.hours = 0;
        }
    }
    double getHours(){
        return hours;
    }
    double earnings( ) { 
        if (hours <= 40){ 
            return wage * hours; 
        } 
        else { 
            return 40*wage + (hours-40)*wage*1.5; 
        } 
    }  
    String tostring() {
         return "\nHourly employee:  "+ super.tostring(); 
    }  

}

class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;
    CommissionEmployee() {}
    CommissionEmployee (String firstName, String lastName, String nationalIdCardNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, nationalIdCardNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }
    void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }
    double getGrossSales() {
        return grossSales;
    }
    void setCommissionRate(double grossSales) {
        this.grossSales = grossSales;
    }
    double getCommissionRate() {
        return grossSales;
    }
    String tostring() {  
        return "\nCommission employee: " + super.tostring(); 
    }  
    double earnings() { 
        return grossSales * commissionRate; 
    } 

}

class BasePlusCommissionEmployee extends CommissionEmployee {
    private double  baseSalary;
    BasePlusCommissionEmployee() {}
    BasePlusCommissionEmployee (String firstName, String lastName, String nationalIdCardNumber, double grossSales, double commissionRate,  double baseSalary) {
        super(firstName, lastName, nationalIdCardNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }
    void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    }
    double getBaseSalary() {
        return baseSalary;
    }
    String tostring() {  
        return "\nBase plus Commission employee: " + super.tostring();  
    }   
    double earnings() {  
        return baseSalary + super.earnings();  
    }

}

public class PayRollSystemTest {
    public static void main(String[] args) {
        Employee firstEmployee = new SalariedEmployee("Muhammad", "Ali", "11111-1111", 800.00);
        Employee secondEmployee = new CommissionEmployee("Tarwan", "Kumar",
                "222-22-2222", 10000, 0.06);
        Employee thirdEmployee = new BasePlusCommissionEmployee("Fabeeha", "Fatima", "333-33-3333", 5000, 0.04, 300);

        Employee fourthEmployee = new HourlyEmployee("Hasnain", "Ali", "444-44-4444", 16.75, 40);
        // polymorphism: calling tostring() and earning() on Employee’s reference
        System.out.println(firstEmployee);
        System.out.println(firstEmployee.earnings());
        System.out.println(secondEmployee);
        System.out.println(secondEmployee.earnings());
        System.out.println(thirdEmployee);
        // performing downcasting to access & raise base salary
        BasePlusCommissionEmployee currentEmployee = (BasePlusCommissionEmployee) thirdEmployee;
        double oldBaseSalary = currentEmployee.getBaseSalary();
        System.out.println("old base salary: " + oldBaseSalary);
        currentEmployee.setBaseSalary(1.10 * oldBaseSalary);
        System.out.println("new base salary with 10% increase is:" + currentEmployee.getBaseSalary());
        System.out.println(thirdEmployee.earnings());
        System.out.println(fourthEmployee);
        System.out.println(fourthEmployee.earnings());
    } // end main
} // end class
