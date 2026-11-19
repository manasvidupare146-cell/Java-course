package OOPExample;

/**
 this keyword is used to refer object and class members .
 */


class User{

    int userid;
    String name;

    User(int userid,String name)
    {
        this.userid=userid;
        this.name=name;
    }

    void display()
    {
        System.out.println("ID: "+userid+" Name: "+name);
    }
}
public class thisKeyword {
    public static void main(String[] args) {
        User u1=new User(101,"Manasvi");
        User u2=new User(102,"Parul");
        u1.display();
        u2.display();
    }
}
