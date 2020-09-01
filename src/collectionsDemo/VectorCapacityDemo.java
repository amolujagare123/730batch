package collectionsDemo;

import java.util.Vector;

public class VectorCapacityDemo
{

    public static void main(String[] args) {

        Vector<String> v = new Vector<>(); // capacity is 10 by defalt
        System.out.println("Size="+v.size()); // 0
        System.out.println("Capacity="+v.capacity()); // 10

        v.add("priyanka");
        v.add("amol");
        v.add("praful");
        v.add("gaurav");
        v.add("sagar");

        System.out.println(v);

        System.out.println("Size="+v.size()); // 5
        System.out.println("Capacity="+v.capacity()); // 10

        v.add("priyanka");
        v.add("amol");
        v.add("praful");
        v.add("gaurav");
        v.add("sagar");

        System.out.println("Size="+v.size()); //  10
        System.out.println("Capacity="+v.capacity()); // 10

        v.add("sagar");

        System.out.println("Size="+v.size()); // 11
        System.out.println("Capacity="+v.capacity()); // 20

        v.add("priyanka");
        v.add("amol");
        v.add("praful");
        v.add("gaurav");
        v.add("sagar");
        v.add("priyanka");
        v.add("amol");
        v.add("praful");
        v.add("gaurav");
        v.add("sagar");

        System.out.println("Size="+v.size()); // 21
        System.out.println("Capacity="+v.capacity()); // 40
    }

}
