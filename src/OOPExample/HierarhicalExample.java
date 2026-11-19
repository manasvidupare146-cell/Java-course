package OOPExample;

class Shape{
    protected int a;
    protected  int b;

    void setdata(int m,int n)
    {
        a=m;
        b=n;
    }
}
class Rectangle extends  Shape{
      int rec_get()
      {
          int result=a*b;
          return result;
      }
}

class Triangle extends  Shape{
    float tri_get()
    {
        float result=0.5F*a*b;
        return result;
    }
}
public class HierarhicalExample {
    public static void main(String[] args) {
         Rectangle r=new Rectangle();
         Triangle t=new Triangle();


         r.setdata(12,5);
        System.out.println("Area of Rectangle : "+r.rec_get());

        t.setdata(13,5);
        System.out.println("Area of Triangle : "+t.tri_get());
    }
}
