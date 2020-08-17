package FinalAndStaticKeyword;

public class Finalvariabldemo {

    final int count = 10;

    void change()
    {
      //  count = 10;
    }

    public static void main(String[] args) {
        Finalvariabldemo ob = new Finalvariabldemo();

        System.out.println(ob.count);
        ob.change();
        System.out.println(ob.count);

    }

}
