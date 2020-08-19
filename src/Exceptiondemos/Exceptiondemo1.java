package Exceptiondemos;

public class Exceptiondemo1 {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        int c =1;

        try {
            c = a / b; // infinity
        }
        catch (Exception e)
        {
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.getClass());

            e.printStackTrace();

            System.out.println("inside catch");
        }

        System.out.println("Division is :"+c);

        System.out.println("Program is ended");


    }


}
