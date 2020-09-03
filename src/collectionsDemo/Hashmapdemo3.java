package collectionsDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Hashmapdemo3 {

    public static void main(String[] args) {
        HashMap hm = new HashMap();

        hm.put(101, "abc");
        hm.put(343, "pqr");
        hm.put(323, "xyz");
        hm.put(210, "asd");
        hm.put(111, "zzz");

        System.out.println("hashMap="+hm);

        Set keySet = hm.keySet();
        System.out.println("Key set ="+ keySet);

        Collection value =  hm.values();

        System.out.println("values="+value);

        Set entrySet = hm.entrySet();
        System.out.println("entrySet = "+entrySet);

    }
}
