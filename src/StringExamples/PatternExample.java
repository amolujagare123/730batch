package StringExamples;

public class PatternExample {

    public static void main(String[] args) {
        String str ="CUCUMBER";

        for(int i=0;i<str.length();i++)
            System.out.println(str.substring(i) + str.substring(0,i) );

        // try this matrix format as homework
    }

}
