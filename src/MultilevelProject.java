
class CompamyManufacturingD1{

   void company_visit(){
       System.out.println("Take complete data for Manufacturing");}



}
class CompanyManufacturingD2 extends CompamyManufacturingD1{

    void Manufacturing( int sectors)
    {
        if(sectors==1)
        {
            System.out.println("Automobiles & EVs");
        }
        else if(sectors==2)
        {
            System.out.println("Metals, Steel & Chemicals");
        }
        else if(sectors==3)
        {
            System.out.println("Electronics & Industrial Machinery");
        }
    }

}

class CompanyManufacturingD3 extends CompanyManufacturingD2{

    void install()
    {
        System.out.println("Final Manufacturing");
    }
}


public class MultilevelProject {
    public static void main(String[] args) {

        CompanyManufacturingD3 obj = new CompanyManufacturingD3();

        obj.company_visit();
        obj.Manufacturing(2);
        obj.install();

    }
}


