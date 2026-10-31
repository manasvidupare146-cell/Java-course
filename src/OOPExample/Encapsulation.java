package OOPExample;

class Login{
    private String phno;
    private int otp;

    //setter
    public void setdata(String x,int y)
    {
        phno=x;
        otp=y;
    }
    //getter

    String getPhno()
    {
        return phno;
    }

    int getOtp()
    {
        return otp;
    }

}

public class Encapsulation {
    public static void main(String[] args) {
        Login l=new Login();
        l.setdata("123456779",1234);
        System.out.println("Number: "+l.getPhno()+" OTP: "+l.getOtp());
    }
}
