package ClassesAndconstructors;

public class Myclass {
    int a;
    double d;
    char c;
    String str;

    Myclass(int a, double d, char c, String str )
    {
         // no boday
        this.a = a;
        this.d=d;
        this.c = c;
        this.str= str;

    }

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

       // int x;

        Myclass ob = new Myclass(23,34.5,'k',"abcd");

       /* ob.a = 12;
        ob.d =  23.67;
        ob.c='c';
        ob.str="abc";*/

        ob.display();

        Myclass ob1 = new Myclass(12,45.6,'g',"pqrs");
        ob1.display();

        /*Myclass ob1 = new Myclass();

        ob1.a =89;
        ob1.d =78.45;
        ob1.c='j';
        ob1.str = "pqr";

       ob1.display();*/

       //x = ob.a +ob1.a;


    }


}
