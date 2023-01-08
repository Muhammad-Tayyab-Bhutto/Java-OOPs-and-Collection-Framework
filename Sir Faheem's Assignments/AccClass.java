import java.util.*;
class Account {
	int id;
	String name;
	double balance;

	Account() {
		this.id = 1234;
		this.name = "XYZ";
		this.balance = 00.00;
	}

	void deposite() {
		Scanner sc = new Scanner(System.in);
		double amount;
		System.out.print("How many amount you want to deposite ?\nEnter the amount : ");
		amount = sc.nextDouble();
		this.balance = this.balance + amount;
		System.out.println("You have Deposite Successfully. ");
	}

	String withdraw() {
		Scanner sc = new Scanner(System.in);
		double amount;
		System.out.print("How many amount you want to Withdraw ?\nEnter the amount : ");
		amount = sc.nextDouble();
		String r = "";
		if (this.balance > 0) {
			if (amount < this.balance) {
				this.balance = this.balance - amount;
				r = "You have Withdraw Successfully. ";
			} else if (amount > this.balance) {
				r = "You have entered Insufficient Balance ";
			} else if (amount == this.balance) {
				r = "Your balance is equal to amount you should deposite the amount ";
				this.balance = this.balance - amount;
				r = "You have Withdraw Successfully. ";
				// System.out.println("After Withdrawal Updates are: ");
				// this.checkBalance();
			}
		} else {
			r ="Your account have no amount ";

		}
		return r;
	}

	void checkBalance() {
		System.out.println("Name : " + name);
		System.out.println("Account ID: " + id);
		System.out.println("Your Balance: " + balance);
	}

}

class AccClass {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Account a1 = new Account();
		System.out.print("Enter the name: ");
		a1.name = sc.nextLine();
		System.out.print("Enter the Account ID: ");
		a1.id = sc.nextInt();
		System.out.print("Enter the balance: ");
		a1.balance = sc.nextDouble();
		a1.checkBalance();
		int choice;
		String s = a1.withdraw();
		if (s == "You have entered Insufficient Balance "){
			System.out.println(s);
		}
		if (s != "You have entered Insufficient Balance "){
			do {
				System.out.print(
						"press 0 to exit \npress 1 for Deposite the Amount:\npress 2 for Withdraw the amount:\n  ");
				choice = sc.nextInt();
				if (choice == 1) {
					a1.deposite();
					System.out.println("After Depositing Updates are: ");
					a1.checkBalance();
				} else if (choice == 2) {
					a1.withdraw();
					System.out.println("After Withdrawal Updates are: ");
					a1.checkBalance();
				} else if (choice == 0) {
					System.out.println("Thanks for working on this program.");
				} else
					System.out.println("Press 0, 1 or 2 :");
			} while (choice != 0);
		}

	}
}