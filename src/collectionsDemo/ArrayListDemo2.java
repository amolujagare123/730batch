package collectionsDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList();

        al.add("amol");
        al.add("anil");
        al.add("aparna");
        al.add("abhishek");
        al.add("priyanka");
        al.add("priyanka");

        System.out.println("before sort"+al);
        Collections.sort(al);
        System.out.println("sorted"+al);

        al.set(1,"new element");

        System.out.println("After set"+al);

        al.remove("new element");
        System.out.println("After remove"+al);
        al.remove(3);

        System.out.println("After remove"+al);





        // printing using for each
        /*for(String str:al)
            System.out.println(str);*/

        // collection framework allows only non premitive datatype
        // premetive data types .. int float char boolean

        ArrayList<Integer> al2 = new ArrayList<>();

        al2.add(12);
        al2.add(23);
        al2.add(45);
        al2.add(54);
        al2.add(66);
        al2.add(57);

        System.out.println("Before clear"+al2);

        System.out.println(al2.isEmpty()); // false

        Collections.sort(al2);

        System.out.println("sorted"+al2);

      //  al2.clear();

       // System.out.println("after clear"+al2);
        //System.out.println(al2.isEmpty()); // true


        ArrayList<Character> al3 = new ArrayList<>();
        al3.add('t');
        al3.add('%');


        ArrayList<Boolean> al4 = new ArrayList<>();
        al4.add(true);
        al4.add(false);


        ArrayList<Double> al5 = new ArrayList<>();
        al5.add(23.56);
        al5.add(21.56);



    }
}
