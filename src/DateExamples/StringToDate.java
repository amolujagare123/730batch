package DateExamples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {
    public static void main(String[] args) throws ParseException {

        String dateStr = "12/09/2019";

        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");

        Date date = sd.parse(dateStr);

        System.out.println(date);
        System.out.println(sd.parse(dateStr));



        String dateStr2= "2016-06-23| 8:34:23";// --> yyyy-MM-dd| h:mm:ss

        SimpleDateFormat sd2 = new SimpleDateFormat("yyyy-MM-dd| h:mm:ss");

        System.out.println(sd2.parse(dateStr2));


        String dateStr3= "Thursday 2016/06/23"; //-->         yyyy

        SimpleDateFormat sd3 = new SimpleDateFormat("EEEE yyyy/MM/dd");

        System.out.println(sd3.parse(dateStr3));

        String dateStr4= "23-06-2016 | thu | 8:34"; // -->
        SimpleDateFormat sd4 = new SimpleDateFormat("dd-MM-yyyy | E | h:mm");

        System.out.println(sd4.parse(dateStr4));

        String dateStr5= "8:34:22"; // --> h:mm:ss
        SimpleDateFormat sd5 = new SimpleDateFormat("h:mm:ss");
        System.out.println(sd5.parse(dateStr5));
    }

}
