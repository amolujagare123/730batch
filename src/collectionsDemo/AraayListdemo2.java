package collectionsDemo;

import java.util.ArrayList;

public class AraayListdemo2 {
    public static void main(String[] args) {


        ArrayList<String> al = new ArrayList();

        al.add("amol");
        al.add("anil");
        al.add("aparna");
        al.add("abhishek");
        al.add("priyanka");
        al.add("priyanka");

        System.out.println(al);

        ArrayList<String> al2 = new ArrayList();

        al2.add("abc1");
        al2.add("abc2");
        al2.add("abc3");
        al2.add("abc4");
        al2.add("abc5");

        System.out.println(al2);

        al.addAll(al2);

        System.out.println(al);

        //al - [amol, anil, aparna, abhishek, priyanka, priyanka, abc1, abc2, abc3, abc4, abc5]

        System.out.println(al2);


        al.removeAll(al2);
        System.out.println(al);


    }

}
