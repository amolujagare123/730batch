package DateExamples;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

    public static void main(String[] args) {


        Date date = new Date() ;

        System.out.println(date);

        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");

        String dateStr = sd.format(date);

        System.out.println(dateStr);


        SimpleDateFormat sd1 = new SimpleDateFormat("dd-MM-yyyy");

        System.out.println(sd1.format(date));


        SimpleDateFormat sd2 = new SimpleDateFormat("dd-MMMM-yyyy");
        System.out.println(sd2.format(date));

        SimpleDateFormat sd3 = new SimpleDateFormat("dd | MMMM yy h:mm");
        System.out.println(sd3.format(date));



    }

}
