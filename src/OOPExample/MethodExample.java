package OOPExample;

/**
 Method:When we use function inside a class is called method.
 */


import java.util.*;

class Product{
    int id;
    String name;
    float price;


    //to put values for given memebers
    void Setdata(int x,String y,float z)
    {
         id=x;
         name=y;
         price=z;
    }
    //user-define method to show given data
    void display()
    {
        System.out.println("ID: "+id+" Name : "+name+" Price: "+price);
    }

    String validation()
    {
        if(price>100000){
            return "Out of range";

        }
        else{
            return "within range";//it pass control to calling method
        }
    }

    String Reward(int code){
        if(code==1){
            return "50% off in Product";
        }
        else if(code==2){
            return "Buy 1 get 1 free";
        }
        else if(code==3){
            return "Free Delivery";
        }
        else{

            return ""  ;
        }
    }

}

public class MethodExample {
    public static void main(String[] args) {

        Product p=new Product();
        Product p2=new Product();

        p.Setdata(1,"Hp Victus",75000);
        p.display();

        System.out.println("Validation: "+p.validation());
        System.out.println(p.Reward(1));


        p2.Setdata(2,"Asus Tuff Gaming",180000);
        p2.display();
        System.out.println("Validation: "+p2.validation());
        System.out.println(p.Reward(2));
    }
}
