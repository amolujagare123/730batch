package Exceptiondemos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo2 {

    public static void main(String[] args) throws ParseException {

        String str = "30/12/2020";

        SimpleDateFormat sd = new SimpleDateFormat("dd/MM /yyyy");
        Date date=null;
        try {
            date = sd.parse(str);
        }
        catch (Exception e)
        {
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.getClass());

            e.printStackTrace();

            System.out.println("inside catch");
        }

        System.out.println(date);

        System.out.println("End of the program");



    }

}
