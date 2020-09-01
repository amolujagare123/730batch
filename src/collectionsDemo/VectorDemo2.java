package collectionsDemo;

import java.util.Vector;

public class VectorDemo2 {


    public static void main(String[] args) {


        Vector<String> v = new Vector<>(5); // capacity is 10 by defalt
        System.out.println("Size="+v.size()); // 0
        System.out.println("Capacity="+v.capacity());

        v.add("priyanka");
        v.add("amol");
        v.add("praful");
        v.add("gaurav");
        v.add("sagar");

        v.add("sagar");

        System.out.println("Size="+v.size()); // 6
        System.out.println("Capacity="+v.capacity()); // 10


    }


}
