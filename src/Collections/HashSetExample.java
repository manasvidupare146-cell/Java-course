package Collections;
/*
Set is  collection which store unique data collection which not allow duplicate entry in same set.
Set is unordered ,unindex(means we cannot index it)
 */
import java.util.*;
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> h=new HashSet<>();
        System.out.println(h);

        h.add(23);

        h.add(33);
        h.add(13);
        h.add(53);
        h.add(15);
        h.add(53);
        System.out.println(h);

        System.out.println(h.size());
    }
}
