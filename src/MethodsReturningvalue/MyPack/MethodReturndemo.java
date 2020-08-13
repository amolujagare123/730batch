package MethodsReturningvalue.MyPack;

public class MethodReturndemo {


    // lets write a method that return an object of "SomeData"

    SomeData myMethodReturnsObject()
    {
        SomeData ob = new SomeData();

        ob.a = 10;
        ob.b = 20;
        ob.str = "my string";

        return ob;

    }

    public static void main(String[] args) {

        MethodReturndemo ob = new MethodReturndemo();

        SomeData someData = ob.myMethodReturnsObject();

        someData.display();
    }


}
