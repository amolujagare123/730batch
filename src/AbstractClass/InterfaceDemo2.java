package AbstractClass;

public interface InterfaceDemo2 {

    void start(); // public
    void run();

    void display();
}


interface Interface3
{
   void display();
}


class ChildOfTwoInterface implements InterfaceDemo2,Interface3
{

    public void start() {
        System.out.println("start");
    }


    public void run() {
        System.out.println("run");
    }


    public void display() {
        System.out.println("display");
    }


    public static void main(String[] args) {

        ChildOfTwoInterface ob = new ChildOfTwoInterface();
        ob.display();


        InterfaceDemo2 ob1 = new ChildOfTwoInterface();
        ob1.display();
    }
}
