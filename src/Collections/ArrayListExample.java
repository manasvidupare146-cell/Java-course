package Collections;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>();
        System.out.println(names);


        //add:Append means adding element in last.
        names.add("Manasvi");
        names.add("Parul");
        names.add("Kunjan");
        names.add("Parul");
        System.out.println(names);

        //index

        System.out.println(names.indexOf("Parul"));

        //lastIndexOf()
        System.out.println(names.lastIndexOf("Parul"));

        ArrayList <String>blood_group=new ArrayList<>();
        blood_group.add("A+");
        blood_group.add("AB+");
        blood_group.add("Z");
        blood_group.add("B+");
        blood_group.add("O+");
        System.out.println(blood_group);

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
        Collections.sort(num);
        System.out.println(num);


        Collections.sort(blood_group);
        System.out.println(blood_group);



    }
}
