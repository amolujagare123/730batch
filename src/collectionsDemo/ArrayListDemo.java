package collectionsDemo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add("amol");
        al.add("anil");
        al.add("aparna");
        al.add("abhishek");
        al.add("priyanka");
        al.add("priyanka");
        al.add(null);
        al.add(12);
        al.add(12.5);
        al.add('v');
        al.add(true);

        Date date = new Date();
        al.add(date);

        System.out.println(al);
        System.out.println(al.size());

        // for loop

        //System.out.println(al.get(1));

        System.out.println("--- normal for loop ----");

       for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }

      // for each loop  can not be used in heterogeous list

       // for()
        System.out.println("--- using iterator interface ----");

        Iterator itr  = al.iterator();

        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }


    }

}
