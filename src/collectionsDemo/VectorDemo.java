package collectionsDemo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {
        Vector<String> v = new Vector<>();

        v.add("priyanka");
        v.add("amol");
        v.add("praful");
        v.add("gaurav");
        v.add("sagar");

        System.out.println(v);

        System.out.println("priting using iterator");

        Iterator itr = v.iterator();
        while (itr.hasNext())
            System.out.print(itr.next()+" ");

        System.out.println("priting using enumeration");
        Enumeration e = v.elements();
        while (e.hasMoreElements())
            System.out.print(e.nextElement()+" ");

       Object[] myArray =  v.toArray();


        System.out.println("priting using converted array");
       for(int i = 0; i<myArray.length ;i++)
           System.out.println(myArray[i]);


    }
}
