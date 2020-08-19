package Exceptiondemos;

public class TheThrowExample {


    void checkSatus(int i) throws Exception  // 0 - 10
    {
        // i accepts values in between 1-10 only if any other value is there then it should
        // stop the execution of the profram

        if(i>=0 && i<=10)
            System.out.println("We are safe");
        else
            throw new Exception("we are not safe");

    }


    public static void main(String[] args) throws Exception {

        TheThrowExample ob = new TheThrowExample();
try {
    ob.checkSatus(11);
}
    catch (Exception e)
    {
        System.out.println(e);
    }

        System.out.println("End of the program");

    }



}
