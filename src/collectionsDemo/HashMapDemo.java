package collectionsDemo;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();

        hm.put(101,"abc");
        hm.put(343,"pqr");
        hm.put(323,"xyz");
        hm.put(111,"olm");
        hm.put(210,"zzz");
        hm.put(220,"zzz");
        System.out.println(hm);
        hm.put(220,"amol");

        System.out.println(hm);

        hm.put(null,"aaaa");

        System.out.println(hm);
        hm.put(null,"bbbb");

        System.out.println(hm);

        hm.put(109,null);
        System.out.println(hm);
        hm.put(108,null);
        System.out.println(hm);
    }

}
