class Account {
    private int accountNumber; // account number
    private int pin; // PIN for authentication
    private double availableBalance; // funds available for withdrawal
    private double totalBalance; // funds available + pending deposits
    // Account constructor initializes attributes

    public Account(int theAccountNumber, int thePIN, double theAvailableBalance, double theTotalBalance) {
        accountNumber = theAccountNumber;
        pin = thePIN;
        availableBalance = theAvailableBalance;
        totalBalance = theTotalBalance;
    } // end Account constructor
      // determines whether a user-specified PIN matches PIN in Account

    public boolean validatePIN(int userPIN) {
        if (userPIN == pin)
            return true;
        else
            return false;
    } // end method validatePIN
      // returns available balance

    public double getAvailableBalance() {
        return availableBalance;
    } // end getAvailableBalance
      // returns the total balance

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }
    public double getTotalBalance() {
        return totalBalance;
    } // end method getTotalBalance
      // credits an amount to the account

    public void credit(double amount) {
        totalBalance += amount; // add to total balance
    } // end method credit
      // debits an amount from the account

    public void debit(double amount) {
        availableBalance -= amount; // subtract from available balance
        totalBalance -= amount; // subtract from total balance
    } // end method debit
      // returns account number

    public int getAccountNumber() {
        return accountNumber;
    } // end method getAccountNumber
    public String toString(){
        return "Account Number: " + accountNumber + " Availble Balance: " + availableBalance + " Total Balance: " + totalBalance;
    }
} // end class Account

class SavingsAccount extends Account {
    private double interest;
    private int year;
    public SavingsAccount(int theAccountNumber, int thePIN, double theAvailableBalance, double theTotalBalance, int year){
        super(theAccountNumber, thePIN, theAvailableBalance, theTotalBalance);
        this.year = year;
    }
    public void getInterest(){
        double principal = 1000.0; // initial amount before interest
        double rate = 0.05; // interest rate
        // calculate amount on deposit for each of ten years
        // calculate new amount for specified year
        interest = principal * Math.pow( 1.0 + rate, year );
        // display the year and the amount
        System.out.println( "Year: "+ year+ " Interest: "+ interest);
    }
    public String toString(){
        return super.toString() + " Interest: " + interest + " Years: " + year;
    }
}

class CurrentAccount extends Account {
    private double newAmount;
    
    public CurrentAccount(int theAccountNumber, int thePIN, double theAvailableBalance, double theTotalBalance, double newAmount) {
        super(theAccountNumber, thePIN, theAvailableBalance, theTotalBalance);
        this.newAmount = newAmount;
    }
    public void setNewAmount(double newAmount){
        this.newAmount = newAmount;
    }
    public void getOverDraft(){
        if (newAmount > 100000){
            System.out.println("Overdraft");
        } else {
            setTotalBalance(newAmount+getTotalBalance());
            System.out.println("Added To Your Balance. " + getTotalBalance());
        }
    }
    public String toString(){
        return super.toString() + " Current Amount: " + newAmount;
    }
}

class Bank {
    private Account[] accounts; // array of Accounts

    public Bank() {
        accounts = new Account[2]; // just 2 accounts for testing
        accounts[0] = new Account(12345, 54321, 1000.0, 12000);
        accounts[1] = new Account(98765, 56789, 200.0, 200.0);
    } // end no-argument BankDatabase constructor
      // retrieve Account object containing specified account number

    private Account getAccount(int accountNumber) {
        // loop through accounts searching for matching account number
        for (Account currentAccount : accounts) {
            // return current account if match found
            if (currentAccount.getAccountNumber() == accountNumber)
                return currentAccount;
        } // end for
        return null; // if no matching account was found, return null
    } // end method getAccount
      // determine whether user-specified account number and PIN match
      // those of an account in the database

    public boolean authenticateUser(int userAccountNumber, int userPIN) {
        // attempt to retrieve the account with the account number
        Account userAccount = getAccount(userAccountNumber);
        // if account exists, return result of Account method validatePIN
        if (userAccount != null)
            return userAccount.validatePIN(userPIN);
        else
            return false; // account number not found, so return false
    } // end method authenticateUser
      // return available balance of Account with specified account number

    public double getAvailableBalance(int userAccountNumber) {
        return getAccount(userAccountNumber).getAvailableBalance();
    } // end method getAvailableBalance
      // return total balance of Account with specified account number

    public double getTotalBalance(int userAccountNumber) {
        return getAccount(userAccountNumber).getTotalBalance();
    } // end method getTotalBalance
      // credit an amount to Account with specified account number

    public void credit(int userAccountNumber, double amount) {
        getAccount(userAccountNumber).credit(amount);
    } // end method credit

    public void debit(int userAccountNumber, double amount) {
        getAccount(userAccountNumber).debit(amount);
    } // end method debit
} // end class BankDatabase

public class BankMain {
    public static void main(String[] args) {
        Account accountDetails = new Account(12345,4444, 10000,50000);
        SavingsAccount savingsAccount = new SavingsAccount(12345,4444, 10000,50000,5);
        CurrentAccount currentAccount = new CurrentAccount(12345,4444, 10000,50000, 5000);
        Bank bank = new Bank();
        savingsAccount.getInterest();
        currentAccount.getOverDraft();
        System.out.println(accountDetails.toString());
        System.out.println(savingsAccount.toString());
        System.out.println(currentAccount.toString());

    }
}
