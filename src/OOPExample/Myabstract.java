package OOPExample;

abstract class MedicalReport{

    abstract void report(String uname,String status);
}

class ReportGenerator extends MedicalReport{

    @Override
    void report(String uname, String status) {
        System.out.println("Username: "+uname+" Status: "+status);
    }
}

//main class
public class Myabstract {
    public static void main(String[] args) {
        ReportGenerator obj=new ReportGenerator();
        obj.report("Manasvi","fit");
    }
}
