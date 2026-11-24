interface Account {
    void showBalance();
    void deposit(float amount);
    void withdraw(float amount);
}

class BankAccount implements Account {

    float balance = 30000;

    public void showBalance() {
        System.out.println("Total Balance: " + balance);
    }

    public void deposit(float amount) {
        balance = balance + amount;
        System.out.println("Deposited Amount: " + amount);
        System.out.println("New Balance: " + balance);
    }

    public void withdraw(float amount) {
        balance = balance - amount;
        System.out.println("Withdrawn Amount: " + amount);
        System.out.println("Final Balance: " + balance);
    }
}

public class interfaceexample {
    public static void main(String[] args) {

        BankAccount obj = new BankAccount();

        obj.showBalance();

        obj.deposit(4000);

        obj.withdraw(7000);
    }
}




















