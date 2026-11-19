package OOPExample;

/*
Constructor: It is an instance ,It calls automatically whenever we call object
of class. In java when create new instance every time it will call it's
constructor using new keyword.

Default and parameterized
 */

class Myplan{

    //constructor
    Myplan()
    {
        System.out.println("Internet & Calling Plan");
    }

}

class Services {

    //constructor
    Services(int choice)
    {
        if(choice==1){
            System.out.println("1.5 GB per Day 56 days rs 399");
        }

        else if(choice==2){
            System.out.println("Unlimited Calls only with 500MB  per Day 56 days rs 499");
        }

        else if(choice==3){
            System.out.println("Unlimited Calls & 2GB   per Day 84 days rs 899");
        }
        else{
            System.out.println("Plan not available");
        }
    }
}

public class ContructorExample {
    public static void main(String[] args) {
      Myplan p=new Myplan();

      Services s=new Services(1);
      Services s2=new Services(3);
      Services s5=new Services(9);
    }
}
