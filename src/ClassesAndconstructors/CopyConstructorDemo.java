package ClassesAndconstructors;

public class CopyConstructorDemo {

    int a;
    double d;
    char c;
    String str;

    CopyConstructorDemo()
    {

    }

    CopyConstructorDemo(int a,double d, char c, String str)
    {
         this.a = a;
         this.d =d;
         this.c = c;
         this.str = str;
    }

    CopyConstructorDemo(CopyConstructorDemo obj)
    {
        a = obj.a;
        d = obj.d;
        c = obj.c;
        str = obj.str;
    }

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {
        CopyConstructorDemo ob = new CopyConstructorDemo();
        ob.a =12;
        ob.d= 23.5;
        ob.c= 'n';
        ob.str="string";
        ob.display();

        System.out.println(ob.a);

        CopyConstructorDemo ob1 = new CopyConstructorDemo(ob);

        ob1.display();

        CopyConstructorDemo ob2 = new CopyConstructorDemo(ob);

        CopyConstructorDemo ob3 = new CopyConstructorDemo(23,6.34,'y',"sasa");
        ob3.display();

    }
}
