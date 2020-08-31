package collectionsDemo;

import java.util.ArrayList;

public class RemoveIfExample {

    public static void main(String[] args) {

        ArrayList<Integer> al2 = new ArrayList<>();

        al2.add(12);
        al2.add(23);
        al2.add(45);
        al2.add(54);
        al2.add(66);
        al2.add(57);

        System.out.println("Before removeIf:"+al2);

        // remove all the elements which are less than 40

        al2.removeIf(a -> a<40 );
        // a is variable of type int | -> predicate symbol | condition

        System.out.println("After removeIf:"+al2);


        ArrayList<String> al = new ArrayList();

        al.add("amol");
        al.add("anil");
        al.add("aparna");
        al.add("abhishek");
        al.add("priyanka");
        al.add("priyanka");

        System.out.println("before removeIf:"+al);
        // remove the elements which starts with 'a'

        al.removeIf(str -> str.startsWith("a"));

        System.out.println("After removeIf:"+al);


        ArrayList<Character> alc = new ArrayList();
        alc.add('a');
        alc.add('b');
        alc.add('c');
        alc.add('d');
        alc.add('e');
        alc.add('o');
        alc.add('p');
        alc.add('q');
        alc.add('r');
        alc.add('s');
        alc.add('t');
        alc.add('u');

        // remove all the elements with vowels : a, e, i, o, u

        System.out.println("before removeIf:"+alc);
        // remove the elements which starts with 'a'

        alc.removeIf(ch -> (ch=='a') ||(ch=='e') ||(ch=='i') ||(ch=='o') ||(ch=='u') );

        System.out.println("After removeIf:"+alc);





    }
}
