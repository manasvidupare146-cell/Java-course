package Collections;


import java.util.*;
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> n=new LinkedList<>();
        n.add(23);
        n.add(24);
        n.add(25);
        n.add(26);
        n.add(27);
        System.out.println(n);
        System.out.println("--------------------------------");
        for(int v:n){
            System.out.println(v);
        }
        System.out.println("--------------------------------------------");

        //get element by index
        System.out.println(n.get(3));
        System.out.println("--------------------------------------------");


    }
}
