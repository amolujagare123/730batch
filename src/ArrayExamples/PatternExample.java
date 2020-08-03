package ArrayExamples;

public class PatternExample {

    public static void main(String[] args) {

        int n = 6;

        for(int j=1 ; j<=n ;j++) {

            {
                for (int i = 1; i <= j; i++)
                    System.out.print(i + " ");
            }
            System.out.println();
        }


    }
}
