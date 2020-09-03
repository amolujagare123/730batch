package collectionsDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedhashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(23);
        lhs.add(343);
        lhs.add(123);
        lhs.add(231);
        lhs.add(123);
        lhs.add(3);
        lhs.add(null);

        System.out.println(lhs);

    }
    }
