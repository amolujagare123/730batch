package collectionsDemo;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        Stack<String> s = new Stack<>();

        System.out.println(s.empty());

        s.push("abc1");
        s.push("abc2");
        s.push("abc3");
        s.push("abc4");
        s.push("abc5");
        s.push("abc6");

        System.out.println(s);
        System.out.println(s.empty());

        System.out.println(s.pop());

        System.out.println(s);

        System.out.println(s.pop());

        System.out.println(s);

        System.out.println(s.peek()); //
        System.out.println(s);


    }

}
