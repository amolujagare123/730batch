package WrapperClassDemos;

public class DatatypesDemo {

    public static void main(String[] args) {

        byte b = 12;

        Short s = 32767;


        float f = 34.6f;

        double d = 45.7;


        boolean result = true;

        char ch ='h';


        int x = 5; // premitive datatype into non premitive

        Integer ii = new Integer(x);

        System.out.println("ii="+ii);

        Integer ii1 = 6; // auto boxing , autowrapping
        System.out.println("ii1="+ii1);


        int z = ii.intValue(); // unboxing, unwraping
        System.out.println("z="+z);

        int z1 = ii;
        System.out.println("z1="+z1);// autounboxing, autounwraping


        for(Integer i =0;i<10;i++)
        {
            System.out.println(i);
        }






    }


}
