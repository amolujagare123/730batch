package MethodsReturningvalue;

public class RetuningMethodsdemo {


    void display()
    {
        System.out.println("this is display");
    }

    int mymethod()
    {
        int c;
        c =10;
        return  c;
    }

    double returnDouble()
    {
        double d = 89.5;

        return d;
    }

    double returnDouble1()
    {
         return 67.9;
    }

    char returnCharacter()
    {
        return 'c';
    }

    char returnCharacter1()
    {
        char ch ='j';
        return ch;
    }



    String retrunstring()
    {
        String str = "abcd";
        return  str;
    }

    String retrunstring1()
    {

        return  "my string";
    }


    int[] retrunArrayIntSingle()
    {
        int[] a = {34,67,89,32,45,23,12};

        return a;
    }

    char[] returnArrayCharSingle()
    {
        char[] ch = {'h','t','q','w','g','h','/'};

        return ch;

    }

    String[] returnarrayStringSingle()
    {
        String[] stArr = {"abc1","abc2","abc3","abc4","abc5","abc6"};
        return  stArr;
    }

    int[][] retunArrayIntTwoDimentional()
    {
        int[][] aTwod= {{1,1,1},{2,2,2},{3,3,3}};

        return aTwod;
    }

    public static void main(String[] args) {

        RetuningMethodsdemo ob =new  RetuningMethodsdemo();

        int x = ob.mymethod(); // 10

        System.out.println(x);



        double y = ob.returnDouble();

        double y1 = ob.returnDouble1();

        System.out.println(y);
        System.out.println(y1);

        char c1 = ob.returnCharacter();
        char c2 = ob.returnCharacter1();
        System.out.println(c1);
        System.out.println(c2);


        String s1 = ob.retrunstring1();
        String s2 = ob.retrunstring();

        System.out.println(s1);
        System.out.println(s2);



        int[] myArray = ob.retrunArrayIntSingle();

        for(int i=0;i<myArray.length;i++)
            System.out.print(myArray[i]+"  ");

        System.out.println();

        char[] mychrArray = ob.returnArrayCharSingle();
        for(int i =0;i<mychrArray.length;i++)
            System.out.print(mychrArray[i]+"  ");

        System.out.println();

        String[] myStringArray = ob.returnarrayStringSingle();
        for(int i=0;i<myStringArray.length;i++)
            System.out.print(myStringArray[i]+"   ");

        System.out.println();
        int[][] twoDarray = ob.retunArrayIntTwoDimentional();

        for(int i =0 ; i<twoDarray.length;i++) {
            for (int j = 0; j < twoDarray[0].length; j++) {

                System.out.print(twoDarray[i][j]+" ");
            }
            System.out.println();
        }


    }


}
