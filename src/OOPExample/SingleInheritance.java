package OOPExample;

class Customer{

    int tbno=101;
    String name="Kunjan";
    String address="sadar";
}

class Order extends Customer{

    Order(int orderno,String ordername)
    {
        System.out.println("Order NO: "+orderno);
        System.out.println("Name of Order: "+ordername);
        System.out.println("Customer Details: "+ name+"|  Address: "+address);
    }

}

public class SingleInheritance {
    public static void main(String[] args) {
        Order o=new Order(102,"Pizza");

    }
}
