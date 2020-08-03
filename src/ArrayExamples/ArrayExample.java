package ArrayExamples;

public class ArrayExample {

    public static void main(String[] args) {

        int[] a = new int[4];

        a[0] = 12;
        a[1] = 45;
        a[2] = 34;
        a[3] = 56;

        for(int i =0 ;i <a.length ;i++)
        {
            if(a[i]%2==0)
              System.out.println(a[i]+" even");

            else
               System.out.println(a[i]+" odd");

        }




    }
}
