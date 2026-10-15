public class StringExample {
    public static void main(String[] args) {


        //String concatenation:combining of two or more strings
        String fname="Manasvi";
        String lname="Dupare";
        String fullname=fname+" "+lname;
        String data=fname.concat(" "+lname);
        System.out.println(fullname);
        System.out.println(data);

        //length
        System.out.println(fname.length());

        //replace:replace old character with new character
        String stmt="Learning C/C++";
        System.out.println(stmt);
        System.out.println(stmt.replace("C/C++","Java"));

        //comparision:So comparision of two string should be 0 for true and 1 for false.
        String sign1="Manasvi";
        String sign2="Manasvi";
        if(sign1.compareTo(sign2)==0){
            System.out.println("Signture match");
        }
        else{
            System.out.println("Wrong signture");
        }

        System.out.println("-----------------------");
        if(sign1.equals(sign2)){
            System.out.println("Match");
        }
        else{
            System.out.println("not match");
        }

        String sen="Hello world";
        System.out.println(sen.startsWith("h"));
        System.out.println(sen.endsWith("d"));

        System.out.println("----------------------");
        String email="     mansvi@gmail.com       ";
        System.out.println(email);
        System.out.println(email.trim());

        String name="Manasvi";
        System.out.println(name.indexOf("a"));
        System.out.println(name.lastIndexOf("a"));

        System.out.println("--------------------------------");
        String ltr="Welcome to class of Java programmings";
        System.out.println(ltr.contains("Java"));


        System.out.println(ltr.charAt(8));

    }
}
