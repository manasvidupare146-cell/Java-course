package Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>();
        System.out.println(names);
        System.out.println("--------------------------------------------");

        //add:Append means adding element in last.
        names.add("Manasvi");
        names.add("Parul");
        names.add("Kunjan");
        names.add("Parul");
        System.out.println(names);
        System.out.println("--------------------------------------------");
        //index

        System.out.println(names.indexOf("Parul"));

        //lastIndexOf()
        System.out.println(names.lastIndexOf("Parul"));
        System.out.println("--------------------------------------------");
        ArrayList <String>blood_group=new ArrayList<>();
        blood_group.add("A+");
        blood_group.add("AB+");
        blood_group.add("Z");
        blood_group.add("B+");
        blood_group.add("O+");
        System.out.println(blood_group);
        System.out.println("--------------------------------------------");
        //addAll
        names.addAll(blood_group);
        System.out.println(names);


        //Collections class is used to sort elements

        ArrayList <Integer> num=new ArrayList<>();
        num.add(12);
        num.add(2);
        num.add(1);
        num.add(4);
        num.add(10);

//ascending order
        System.out.println("--------------------------------------------");
        Collections.sort(num);
        System.out.println(num);

        System.out.println("--------------------------------------------");
        Collections.sort(blood_group);
        System.out.println(blood_group);

//Iteration of elment one by one
        System.out.println("--------------------------------------------");
        //foreach using object iteration
        for(String n:names)
        {
            System.out.println(n);
        }
        System.out.println("--------------------------------------------");
        //using normal for loop with total size
        for(int i=0;i<names.size();i++)
        {
            System.out.println(names.get(i));
        }

        System.out.println("--------------------------------------------");
        System.out.println("The length of given list : "+names.size() );
        System.out.println("--------------------------------------------");

        names.remove("A+");
        System.out.println(names);
        System.out.println("--------------------------------------------");
        names.remove(5);
        System.out.println(names);
        System.out.println("-------------------------------");
        System.out.println(names.contains("Kunjan"));
        System.out.println("--------------------------------------------");



    }
}
