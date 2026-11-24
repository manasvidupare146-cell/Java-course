
    interface Account {
        void totalbalance();
        void dep(float amount);
        void withdraw(float amount);


     class BankAccount implements Account {

        float balance = 30000;

        public void totalbalance() {
            System.out.println("Total Balance: " + balance);
        }

        public void dep(float amount) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
            totalbalance();
        }

        public void withdraw(float amount) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
            totalbalance();
        }
    }

    public class Multiple_Inheritance {
        public static void main(String[] args) {

            BankAccount obj = new BankAccount();

            obj.totalbalance();
            obj.dep(4000);
            obj.withdraw(7000);
        }
    }
}
