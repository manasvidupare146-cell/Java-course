package OOPExample;

class Port1{
    void available_ports(String port1,String port2,String port3)
    {
        System.out.println("Port 1: "+port1+" Port 2: "+port2+" Port 3: "+port3);


    }
}
class Port2 extends Port1{
    void available_ports(String port1,String port2)
    {
        System.out.println("Port 1: "+port1+" Port 2: "+port2);


    }
}
public class Static_Binding {
    public static void main(String[] args) {
        Port2 obj=new Port2();
        obj.available_ports("Sim","SD Card");

        Port1 obj2=new Port1();
        obj2.available_ports("Sim1 ","Sim2","SD Card");
    }
}
