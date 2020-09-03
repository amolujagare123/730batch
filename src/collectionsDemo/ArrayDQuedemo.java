package collectionsDemo;

import java.util.ArrayDeque;

public class ArrayDQuedemo {

    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();



        System.out.println(adq.poll()); // null
        //System.out.println(adq.remove()); // throws exception

        System.out.println(adq.peek()); // null
       // System.out.println(adq.element()); // throws exception


        adq.offer(23);
        adq.offer(22);
        adq.offer(13);
        adq.offer(33);
        adq.offer(101);

        System.out.println(adq);

        adq.offerFirst(0);
        adq.offerLast(100);

        System.out.println(adq);

        System.out.println(adq.pollFirst());

        System.out.println(adq.pollLast());
        System.out.println(adq);


        /*System.out.println(adq.poll());
        System.out.println(adq.poll());
        System.out.println(adq.poll());
        System.out.println(adq.poll());
        System.out.println(adq.poll());*/

        System.out.println(adq.peek()); // 23
        System.out.println(adq.element()); // 23
        System.out.println(adq.peekFirst()); // 23
        System.out.println(adq.peekLast()); // 101

        System.out.println(adq);




    }
}
