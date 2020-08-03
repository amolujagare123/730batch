public class SwitchCaseDemo {

    public static void main(String[] args) {

        int a =10;
        int b = 2 ;
        int c = 10;

        String choice = "add";

        switch (choice)
        {
            case "add" :c = a + b ;
                        System.out.println( "Addition is :"+c);
                        break;

            case "sub" :c = a - b ;
                        System.out.println( "substraction is :"+c);
                        break;

            case "mul" :c = a * b ;
                        System.out.println( "Multiplication is :"+c);
                        break;

            case "div" :c = a / b ;
                        System.out.println( "Division is :"+c);
                        break;

        }



    }


}
