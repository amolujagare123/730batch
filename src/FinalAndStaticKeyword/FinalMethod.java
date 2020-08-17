package FinalAndStaticKeyword;

public class FinalMethod {

    final void someMethod()
    {
        System.out.println("parent class implementation");
    }

}


class  childFinalMethod extends FinalMethod
{/*
   final void someMethod()
    {
        System.out.println("child class implementation");
    }*/

}


class childOfChild extends childFinalMethod
{

    /*final void someMethod()
    {
        System.out.println("child class implementation");
    }*/

}