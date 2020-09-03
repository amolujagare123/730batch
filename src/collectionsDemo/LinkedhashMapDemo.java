package collectionsDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedhashMapDemo {

    public static void main(String[] args) {
        LinkedHashMap lhm = new LinkedHashMap();

        lhm.put(101, "abc");
        lhm.put(343, "pqr");
        lhm.put(323, "xyz");
        lhm.put(210, "asd");
        lhm.put(111, "zzz");

        System.out.println("LinkedhashMap="+lhm);
    }
}
