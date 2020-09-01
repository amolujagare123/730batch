package collectionsDemo;

import java.util.PriorityQueue;

public class PriorityQueuedemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> p = new PriorityQueue<>();

        p.offer(23);
        p.offer(11);
        p.offer(1);
        p.offer(45);
        p.offer(10);
        p.offer(21);

        System.out.println(p);

        // actual output : [1, 10, 11, 45, 23, 21]

        // expected output : [1, 10, 11, 21, 23, 45 ]

// some compilers / operating system does not support the priority queue so
        // we may not see the sorted output
        // but if you start removing the elements it will be
        // removed based on the sorted order

        System.out.println(p.poll()); // 1
        System.out.println(p.poll()); // 10
        System.out.println(p.poll()); // 11
        System.out.println(p.poll()); // 21
        System.out.println(p.poll()); // 23
        System.out.println(p.poll()); // 45

        System.out.println(p);

    }
}
