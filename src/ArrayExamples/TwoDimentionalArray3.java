package ArrayExamples;

public class TwoDimentionalArray3 {

    public static void main(String[] args) {

        String[][] starr = {
                {"abc0","pqr0","xyz0"} ,
                {"abc1","pqr1","xyz1"} ,
                {"abc2","pqr2","xyz2"} ,
                {"abc3","pqr3","xyz3"} ,
                {"abc4","pqr4","xyz4"} ,

        };

        for(int i=0;i<starr.length;i++)
        {
            for(int j=0;j<starr[0].length;j++)
            {
                System.out.print(starr[i][j]+" ");
            }
            System.out.println();
        }

    }

}
