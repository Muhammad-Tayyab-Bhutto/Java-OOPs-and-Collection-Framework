import java.util.Scanner;

class Bank{
    Scanner userInput = new Scanner(System.in);
    int accountNumber;
    String name;
    double balance;

    Bank(int accountNumber, String name, double balance){
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }
    Bank(){
         
    }

    void setData(){
        accountNumber = userInput.nextInt();
        userInput.nextLine();
        name = userInput.nextLine();
        balance = userInput.nextDouble();
    }
    void getData(){
        System.out.println("Account Number : "+ accountNumber);
        System.out.println("Name "+ name);
        System.out.println("balance: "+ balance);
    }

}

public class BankAccount {
    public static void main(String h[]){
        Bank bank = new Bank();
        bank.setData();
        bank.getData();
    }
}
