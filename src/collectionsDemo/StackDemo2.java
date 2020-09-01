package collectionsDemo;

import java.util.Stack;

public class StackDemo2 {

    public static void main(String[] args) {

        Stack<String> s = new Stack<>();

        s.push("abc1");// 6
        s.push("abc2");// 5
        s.push("abc3");// 4
        s.push("abc4");// 3
        s.push("abc5");// 2
        s.push("abc6");// 1

        System.out.println(s.search("abc4"));
    }
}
