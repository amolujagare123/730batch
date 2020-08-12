package InheritanceDemo;

public class ParentClass {

    int a;
    int b;

    void display()
    {
        System.out.println("a="+a);
        System.out.println("b="+b);
    }

}


class ChildClass extends ParentClass
{

    int speed ;


    void run()
    {
        System.out.println("this is run method");
    }


}

class  TestInheritance
{
    public static void main(String[] args) {
        ChildClass ob = new ChildClass();

        ob.speed = 10;
        System.out.println(ob.speed);
        ob.run();

        ob.a = 10;
        ob.b = 20;

        ob.display();

        TestInheritance obj = new TestInheritance();



    }
}