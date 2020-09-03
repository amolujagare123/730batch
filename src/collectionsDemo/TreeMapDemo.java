package collectionsDemo;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {
        TreeMap tm = new TreeMap();

        tm.put(101, "abc");
        tm.put(343, "pqr");
        tm.put(323, "xyz");
        tm.put(210, "asd");
        tm.put(111, "zzz");

        System.out.println("Tree Map="+tm);
    }
}
