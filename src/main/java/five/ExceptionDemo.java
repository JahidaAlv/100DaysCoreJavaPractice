package five;

import java.io.FileNotFoundException;
import java.io.FileReader;


public class ExceptionDemo {
    public static void main(String[] args) throws FileNotFoundException {

//        int a = 10;
//        System.out.println(a); // 10
//
//        int result = a / 0;
//        System.out.println(result);  //Exception in thread "main" java.lang.ArithmeticException: / by zero

        try{
            int result = 10 / 2;
            System.out.println("Done");
        }
        catch (Exception e){
            System.out.println("In catch block");
        }

// try-catch, multiple-catch, finally
        int[] a = {1,2,3,4};
        try{
            System.out.println(a[3]);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Exception");
        }
        catch (ArithmeticException e){

        }
        finally {
            System.out.println("Finally - Always execute");
        }

// Checked Exception - Compile-time
        try{
            FileReader fileReader = new FileReader("abc.txt");
        }
        catch (FileNotFoundException e){
//            throw new RuntimeException(e);
        }

    }
}
