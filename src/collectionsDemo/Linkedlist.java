package collectionsDemo;

import java.util.LinkedList;

public class Linkedlist {

    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(23);
        ll.add(33);
        ll.add(44);
        ll.add(11);
        ll.add(46);

        System.out.println(ll);

        ll.addFirst(0);
        ll.addLast(100);

        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);
    }
}
