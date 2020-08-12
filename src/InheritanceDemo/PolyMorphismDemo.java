package InheritanceDemo;

public class PolyMorphismDemo {


    void display()
    {
        System.out.println("this is a display method");
    }

    void display(int a) // overloading
    {
        System.out.println("a is :"+a);
    }

    public static void main(String[] args) {
        PolyMorphismDemo ob = new PolyMorphismDemo();
        ob.display();
        ob.display(35);


        System.out.println("Hello world"); //string as parameter
        System.out.println(); // with no parater - it just prints a new line

        int a =10;

        System.out.println(a); // integer as an argument

        double d = 89.5;

        System.out.println(d); // double as argument

        char ch = 'g';

        System.out.println(ch); // charater as an argument

    }

}
