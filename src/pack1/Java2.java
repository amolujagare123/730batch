package pack1;

import java.util.Date;

public class Java2 {

    int a2;
    double d2;
    char c2;
    String str2;



    void display2()
    {
        System.out.println("a="+a2);
        System.out.println("d="+d2);
        System.out.println("c="+c2);
        System.out.println("str="+str2);
    }

    public static void main(String[] args) {

        Java1 ob = new Java1();
         ob.a1 = 78;

         ob.d1 = 90.34;

         Date date = new Date();
    }
}
