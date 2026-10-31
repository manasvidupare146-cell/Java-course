import java.util.*;
class Product{
    int Id;
    String Name;
    float Price;
    String SeatNo;

    void Setdata(int x, String y, float z,String k)
    {
        Id=x;
        Name=y;
        Price=z;
        SeatNo=k;
    }
    void display()
    {
        System.out.println("ID: "+Id+"Name: "+Name+"Price: "+Price+"");
    }

}
public class MethodPractice {
    public static void main(String[] args) {

    }

}
