import java.util.Scanner;

class Account {
    int id;
    String name;
    double withdraw, deposit, balance;

    Account() {
        id = 123;
        name = "abc";
        balance = 0.00;
    }

    void Withdraw(double withdraw) {
        if (balance >= withdraw) {
            balance = balance - withdraw;
        } else {
            System.out.print("Sorry! Insufficient balance.");
        }
    }

    void Deposit(double deposit) {
        balance = balance + deposit;
    }

    void CheckDetails(double details) {

        if (details == 1) {
            System.out.print("ID: " + id);
            System.out.print("Name: " + name);
            System.out.print("Current Balance: " + balance);
        } else {
            System.out.print("Invalid Key.");
        }
    }

}

public class Bank {
    public static void main(String args[]) {
        Account acc = new Account();
        double dep_amount, withdraw_amount, details;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please eneter deposit amount: ");
        dep_amount = sc.nextDouble();
        acc.Deposit(dep_amount);

        System.out.print("Please eneter withdraw amount: ");
        withdraw_amount = sc.nextDouble();
        acc.Withdraw(withdraw_amount);
        System.out.print("Press 1 to check account details: ");
        details = sc.nextDouble();
        acc.CheckDetails(details);
    }

}

