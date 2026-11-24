package OOPExample;

interface TotalBalance{
    void totalbalance(float amount);
}
interface  Deposits{

    void dep(float amount);
}
interface WithDrawl{
    void withdrawl(float amount);
}


public class interfaceexaple {

 class Account implements TotalBalance ,Deposits, WithDrawl {
 }


     @Override
     public void totalbalance(float amount) {
         System.out.println("Total amount: "+ amount);

     }

     @Override
     public void dep(float amount) {
         System.out.println("Credited: "+amount);

     }

     @Override
     public void withdrawl(float amount) {
         System.out.println("Debited: "+amount);

     }
 }


public class Multiple_Inheritance {
    public static void main(String[] args) {
        Account obj = new Account();
        obj.totalbalance(30000);
        obj.dep(4000);
        obj.totalbalance(34000);
    }
}