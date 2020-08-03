public class FibonanciiSeries {

    public static void main(String[] args) {
        int a=0;
        int b=1;
        int sum =0;

                int n = 6;

        System.out.print(a+" "+b);

        for(int i=2 ;i<n;i++)
        {
            sum = a+b;
            a=b;
            b= sum;
            System.out.print(" "+sum);

        }

    }

}
