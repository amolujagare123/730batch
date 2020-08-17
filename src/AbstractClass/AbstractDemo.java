package AbstractClass;

public abstract  class AbstractDemo {

    abstract  void run();
    abstract  void start();

    AbstractDemo() // we can have constructors in the abstract class
    {

    }


    void display()
    {
        System.out.println("This is a display method");
    }

}


class ChildAbstract extends AbstractDemo
{
    void run()
    {
        System.out.println("run method");
    }

    void start()
    {
        System.out.println("start method");
    }


  //   abstract void somethod();


    public static void main(String[] args) {

        ChildAbstract ob = new ChildAbstract();
        ob.run();
        ob.start();

        AbstractDemo ob1 = new ChildAbstract();

        ob1.run();
        ob1.start();
        ob1.display();

    }

}
