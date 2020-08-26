package WrapperClassDemos;

public class Conversions {

    public static void main(String[] args) {

        String str1 = "11";
        String str2 = "22";

        System.out.println(str1+str2); // 1122

        int a1 = Integer.parseInt(str1);
        int a2 = Integer.parseInt(str2);

        System.out.println(a1+a2);

        String str3 = "11.11";
        String str4 = "22.22";
        System.out.println(str3+str4);

        double d1 = Double.parseDouble(str3);
        double d2 = Double.parseDouble(str4);

        System.out.println(d1+d2);


        String str5 = "true";
        String str6= "false";

        Boolean b1 = Boolean.parseBoolean(str5);

        Boolean b2 = Boolean.parseBoolean(str6);

        if(b1==true)
            System.out.println("this is true");
        if(b2==false)
            System.out.println("this is false");



        String str7 = "h";

        // how to convert sigle character string into character ??

        char ch = str7.charAt(0);





    }
}
