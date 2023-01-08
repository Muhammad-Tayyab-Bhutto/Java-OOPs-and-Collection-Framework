import java.util.Scanner;
class EmployeeIdException extends Exception{
    public EmployeeIdException(String exception){
        super(exception);
    }
}
class Employee{
    private int id;
    public void setId(int id) throws EmployeeIdException{
        if (id <= 0 || id > 9999){
            throw new EmployeeIdException("Invalid Employee ID.");
        }
        else {
            this.id = id;
        }
    }
    public int getId(){
        return id;
    }
}
public class UserDefinedExceptions{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee employee = new Employee();
        int id;
        try {
            System.out.print("Enter ID: ");
            id = input.nextInt();
            employee.setId(id);

        } catch (EmployeeIdException e) {
            System.out.println(e.getMessage());
            try{
                System.out.print("Please Enter ID Again: ");
                id = input.nextInt();
                employee.setId(id);
            }
            catch(EmployeeIdException ex){
                System.out.println(ex.getMessage());
                System.out.println("Thanks your Account is temporary Blocked contact us for more.");
            }
        }
    }
}