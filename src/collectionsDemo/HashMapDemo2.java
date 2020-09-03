package collectionsDemo;

import java.util.HashMap;

public class HashMapDemo2 {

    public static void main(String[] args) {

        HashMap hm = new HashMap();
        System.out.println(hm.isEmpty());
        System.out.println("size="+ hm.size());

        hm.put(101, "abc");
        hm.put(343, "pqr");
        hm.put(323, "xyz");
        hm.put('h', "olm");
        hm.put(210, 344);
        hm.put("amol", "zzz");
        hm.put("amol",23.5);

        System.out.println(hm);
        System.out.println("size="+ hm.size());

        System.out.println(hm.get(101));
        System.out.println(hm.containsKey(101));
        hm.remove(101);
        System.out.println(hm);

        System.out.println(hm.containsKey(101));

        System.out.println(hm.containsValue("olm"));

        System.out.println(hm.containsValue(23.5));

        System.out.println(hm.isEmpty());

        /*HashMap hm1 = new HashMap();
        hm1.put(222,"amol");

        System.out.println(hm1);

        hm1.putAll(hm);

        System.out.println(hm1);*/

        hm.clear();
        System.out.println(hm);
    }
    }
