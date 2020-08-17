package FinalAndStaticKeyword;

public class Counter {
    static int count =0;
    Counter()
    {
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {

        Counter ob1 = new Counter(); // count = 1
        Counter ob2 = new Counter(); // count = 2
        Counter ob3 = new Counter(); // count = 3
    }
}
