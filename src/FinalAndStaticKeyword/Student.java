package FinalAndStaticKeyword;

public class Student {

    int rno;
    String name;
    static String college;

    void display()
    {
        System.out.println("rno="+rno);
        System.out.println("name="+name);
        System.out.println("college="+college);
    }

    public static void main(String[] args) {

        Student ob1 = new Student();
        ob1.rno =1;
        ob1.name="abhishek";
        ob1.college="XYZ";

        ob1.display();

        Student ob2 = new Student();
        ob2.rno =2;
        ob2.name="aparna";
      //  ob2.college="XYZ";

        ob2.display();


        System.out.println(Student.college);


    }

}
