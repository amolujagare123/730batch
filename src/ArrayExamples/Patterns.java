package ArrayExamples;

public class Patterns {
    public static void main(String[] args) {
        /*for (int i =1;i<=4;i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");

            }
            System.out.println();
        }*/


          /*  for (int i=5;i>=1;i--)
            {
                for(int k=1;k<=i;k++) {
                    System.out.print(k+ " ");
                }
                System.out.println();
            }*/


           /*

                1 2 3 4 5
                  1 2 3 4
                    1 2 3
                      1 2
                        1
        * */
        int n =5;
        for (int i=n;i>=1;i--) // outer loop
        {
            for(int j=n-1;j>=i;j--) {  // space loop

                System.out.print("  ");
            }
            for (int k =1;k<=i;k++) // inner loop
            {
                System.out.print(k+ " ");
            }
            System.out.println();
        }


        //int n =5;
        for (int i=n;i>=1;i--)
        {
            for(int j=n-1;j>=i;j--) {

                System.out.print(" ");
            }
            for (int k =1;k<=i;k++)
            {
                System.out.print(k+ " ");
            }
            System.out.println();
        }

        }


}
