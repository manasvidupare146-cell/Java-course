package OOPExample;

interface  Deposit{

    void dep(float amount);
}
interface WithDrawn{
    void withdraw(float amount);
}

//multiple inheritance
class Myaccount implements Deposit,WithDrawn{

    @Override
    public void dep(float amount) {
        System.out.println("Credited: "+amount);
    }

    @Override
    public void withdraw(float amount) {
        System.out.println("Debited: "+amount);
    }
}


public class Multiple_Inheritance {
    public static void main(String[] args) {
           Myaccount obj=new Myaccount();
           obj.dep(25000);
           obj.withdraw(7000);
    }
}
