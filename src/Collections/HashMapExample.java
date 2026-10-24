package Collections;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String,String>h1=new HashMap<>();

        h1.put("name","Manasvi");
        h1.put("address","Mankapur");
        h1.put("course","Java Full Stack");

        System.out.println(h1);

        //get() is used to retreive data or element using key
        System.out.println(h1.get("name"));


        //To check given map are already have data or not
        System.out.println(h1.isEmpty());

        System.out.println(h1.remove("course"));
        System.out.println(h1);

        h1.replace("address","near Mankapur");
        System.out.println(h1);

        h1.clear();
        System.out.println(h1);
    }
}
