package AbstractClass;

public interface InterfaceDemo {

    void start(); // public
    void run();

   /*default void display()
    {

    }*/

}

class ChildOFInterface implements InterfaceDemo
{
    public void start()  // overridden - default
    {
        System.out.println("Start Method");
    }

    public void run()
    {
        System.out.println("run Method");
    }

}
