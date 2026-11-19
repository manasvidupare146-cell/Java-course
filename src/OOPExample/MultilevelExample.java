package OOPExample;


class SolarInstallation1{

       void site_visit()
       {
           System.out.println("Take Complete Data for Installation");
       }
}

class SolarInstallation2 extends SolarInstallation1{

    void quotation(int plan)
    {
        if(plan==1)
        {
            System.out.println("Low");
        }
        else if(plan==2)
        {
            System.out.println("Medium");
        }
        else if(plan==3)
        {
            System.out.println("High");
        }
    }
}

class SolarInstallation3 extends  SolarInstallation2{

    void install()
    {
        System.out.println("Final Implementation");
    }
}


public class MultilevelExample {
    public static void main(String[] args) {
        SolarInstallation3 obj=new SolarInstallation3();
        obj.site_visit();
        obj.quotation(2);
        obj.install();
    }
}
