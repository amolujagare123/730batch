package ArrayExamples;

public class TwoDArrayDemo2 {

    public static void main(String[] args) {

        int[][] a ={
                {23,545,21} ,
                {34,656,23},
                {43,43,67},
                {34,56,23}
        };


        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }

}