package InheritanceDemo;

public class OverridingDemo {


     void start()
    {
        System.out.println("Parents start");
    }

}

class Child extends OverridingDemo
{

    public void start()
    {
        System.out.println("child start");
    }


    public static void main(String[] args) {

        Child ob =new Child();
        ob.start();

        OverridingDemo obj = new Child();
        obj.start();


    }

}
