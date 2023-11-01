package JavaOOP.EncapsulationAndAbstraction;

class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class Example {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("12345", 1000.0);

        // Encapsulation: Accessing account details through getters and methods
        System.out.println("Account Number: " + account.getAccountNumber());
        account.deposit(500.0);
        account.withdraw(200.0);

        // Abstraction: Display account information
        account.displayAccountInfo();
    }
}
