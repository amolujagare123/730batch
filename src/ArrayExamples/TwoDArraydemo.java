package ArrayExamples;

public class TwoDArraydemo {

    public static void main(String[] args) {

        int[][] a = new int[3][3];

        a[0][0] =  34;
        a[0][1] =  32;
        a[0][2] =  14;

        a[1][0] =  34;
        a[1][1] =  32;
        a[1][2] =  14;

        a[2][0] =  34;
        a[2][1] =  32;
        a[2][2] =  14;


        int row = a.length;
        int col = a[0].length;

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(a[i][j]+" ");
            }

            System.out.println();


        }



    }

}
