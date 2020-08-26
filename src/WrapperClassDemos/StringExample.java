package WrapperClassDemos;

public class StringExample {

    public static void main(String[] args) {
        String str = "this is java"; //"java is this"
        String[] stArr = str.split(" ");

        for (int i=stArr.length-1; i>=0 ;i--)
        {
            System.out.print(stArr[i]+" ");
        }


    }

}
