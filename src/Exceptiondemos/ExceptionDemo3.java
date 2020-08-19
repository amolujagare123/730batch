package Exceptiondemos;

public class ExceptionDemo3 {

    public static void main(String[] args) {

        int[] a = new int[3];


        try {
            a[0] = 45;
            a[1] = 67;
            a[2] = 44;
            a[3] = 89;
        }
        catch (Exception e)
        {
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.getClass());

            e.printStackTrace();

            System.out.println("inside catch");
        }

        System.out.println("length:"+a.length);
        System.out.println("end of the program");



    }
}
