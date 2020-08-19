package Exceptiondemos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo {

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {

        FileInputStream fp = new FileInputStream("D:\\Scriptinglogi\\class Activities\\Selenium\\Java\\collections.pptx");


        System.out.println("last line");

       // Thread.sleep(400);

    }

}
