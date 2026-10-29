package OOPExample;


//created class with members
class Myapp{
    String name;
    String version;
    String technology;
}


//main class
public class ObjectExample {
    public static void main(String[] args) {
        //object of Myapp
        Myapp obj=new Myapp();//using new you're creating new instance for given class.

        obj.name="Yono";
        obj.version="5.0";
        obj.technology="Java Spring Boot";

        System.out.println("Name of App: "+obj.name+" Version: "+obj.version+" Technology: "+obj.technology);

    }
}
