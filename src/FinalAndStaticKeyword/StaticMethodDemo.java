package FinalAndStaticKeyword;

public class StaticMethodDemo {

    int rno; // non static
    String name; // non static
    static String college="ABCD"; // static

    void display()
    {
        System.out.println("rno="+rno);
        System.out.println("name="+name);
        System.out.println("college="+college);
    }


    public static void displaymarksAndCollege(String sname, int marks)
    {
        System.out.println("Name="+sname+" Marks="+marks);
        System.out.println(college);

    }

    public static void main(String[] args) {

        StaticMethodDemo ob = new StaticMethodDemo();

        ob.displaymarksAndCollege("amol",56);

        displaymarksAndCollege("abcd",78);

    }



}
