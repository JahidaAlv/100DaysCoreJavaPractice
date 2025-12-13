package five;

import java.io.FileInputStream;
import java.io.IOException;

public class ThrowThrows {

    // Throw

    public static void checkAge(int age){
        if (age < 18){
            throw new ArithmeticException("Not eligible to vote");
        }
        System.out.println("Eligible to vote");
    }

    // Throws

    public static void readFile() throws IOException{
        FileInputStream file = new FileInputStream("abc.txt");
    }


    public static void main(String[] args) {
       checkAge(19);

       try{
           readFile();
       }
       catch (IOException e){
           System.out.println("File not found");
       }
    }
}
