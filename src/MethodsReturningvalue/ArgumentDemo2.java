package MethodsReturningvalue;

import MethodsReturningvalue.MyPack.SomeData;

public class ArgumentDemo2 {


    String getMyString(String str, int a)
    {
        a = 10 ;
        return  str+a;
    }

    int getMyIn(int i)
    {
        return  i;
    }

    int[] getMyArrayIntTwoD(int[] a)
    {
        return  a;
    }

    String[][] getMy2DString(String[][] stArr)
    {
        return stArr;
    }

    int getTotalLengthofStringConcatination(String str1,String str2)
    {
        String combinedString = str1+ str2;
        int lengthCombinedString = combinedString.length();
        return  lengthCombinedString;

    }


    SomeData getMyObject(SomeData obj)
    {
        return  obj;
    }

    public static void main(String[] args) {

        ArgumentDemo2 ob = new ArgumentDemo2();

        String str = ob.getMyString("This is java program",9);
        // print the last word of the sting --> program

       int l =   str.split(" ").length;
        System.out.println(str.split(" ")[l-1]);
        System.out.println(str.split(" ")[0]);

        int myInt = ob.getMyIn(78);
        System.out.println(myInt);

        int[] a = {23,45,22,12,45,78,90};

        int[] b = ob.getMyArrayIntTwoD(a);

        for(int i=0;i<b.length;i++)
            System.out.print(b[i]+" ");

        String[][] stArr1 = {
                {"abc1","abc2","abc3"},
                {"pqr1","pqr2","pqr3"},
                {"xyz1","xyz2","xyz3"}
        };
        System.out.println();


        String[][] stArr2 = ob.getMy2DString(stArr1);


        for(int i =0;i<stArr2.length;i++)
        {
            for (int j=0;j<stArr2[0].length;j++)
            {
                System.out.print(stArr2[i][j]+" ");
            }
            System.out.println();
        }

        SomeData obj1 = new SomeData();
        obj1.a = 3333;
        obj1.b = 7777;
        obj1.str ="selenium";

        SomeData obj2  = ob.getMyObject(obj1);
        obj2.display();


        String str1 = ob.getMyString("abcd1",78);
        System.out.println(str1);

        int totalLength = ob.getTotalLengthofStringConcatination("abc","pqr");
        System.out.println("Total length="+totalLength);


    }

}
