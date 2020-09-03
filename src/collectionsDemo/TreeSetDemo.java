package collectionsDemo;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(23);
        ts.add(343);
        ts.add(123);
        ts.add(231);
        ts.add(33);
        ts.add(3);
       /// ts.add(null);
        System.out.println(ts.first());
        System.out.println(ts.last());
        System.out.println(ts.headSet(123));
        System.out.println(ts.tailSet(123));


        System.out.println(ts.subSet(123,343));
        // first object is inclusive & second object is not inclusive
        // it gives the elements in between these 2 numbers


        System.out.println(ts);

        TreeSet<String> ts1 = new TreeSet<>();

        ts1.add("praful");
        ts1.add("sandeep");
        ts1.add("chaitanya");
        ts1.add("raunak");
        ts1.add("abhijit");

        System.out.println(ts1);
    }
}
