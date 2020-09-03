package collectionsDemo;

import java.util.HashSet;

public class HashSetdemo {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(23);
        hs.add(343);
        hs.add(123);
        hs.add(231);
        hs.add(123);
        hs.add(3);
        hs.add(null);

        System.out.println(hs);

        System.out.println(hs.add(3));

        System.out.println(hs);
    }

}

