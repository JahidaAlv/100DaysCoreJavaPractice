package one;

import org.w3c.dom.ls.LSOutput;

public class Operators {
    public static void main(String[] args) {

        arithmeticDemo();
        unaryDemo();
        assignmentDemo();
        comparisonDemo();
        logicalDemo();


    }
    private static void arithmeticDemo(){

        System.out.println("Arithmetic Operators----->");
        int a = 10, b = 3;
        System.out.println(" a + b = " + (a + b));
        System.out.println(" a - b = " + (a - b));
        System.out.println(" a * b = " + (a * b));
        System.out.println(" a / b = " + (a / b));
        System.out.println(" a % b = " + (a % b));
    }

    private  static void unaryDemo(){
        System.out.println("Unary Operators------->");
        int x = 5;
        int a = ++x;
        System.out.println("++x = " + (++x));
        System.out.println("x++ = " + (x++));
        System.out.println("x after post-increment = " + x);
        System.out.println("-x = " + (-x));
        System.out.println("!(x > 0) = " + (!(x > 0)));
    }

    private static void assignmentDemo(){
        System.out.println("Assignment Operators----->");
        int y = 10;
        y = y + 5;
        System.out.println("y after += and *= : " + y);
    }

    private static void comparisonDemo(){
        System.out.println("Comparison Operators----->");
        int age = 18;
        System.out.println("age >= 18: " + (age >= 18));
        System.out.println("age != 21: " + (age != 21));
    }

    private static void logicalDemo(){
        System.out.println("Logical Operators");
        boolean isAdult = true;
        boolean hasTicket = true;
        if(isAdult && hasTicket){
            System.out.println("Welcome");
        }else {
            System.out.println("Bye");
        }
        if((4 > 10) || (5 < 10)){
            System.out.println("Hello");
        }

        //Ternary --> (condition) : (True) ? (False)
        System.out.println((isAdult || hasTicket) ? "Welcome" : "Bye");
    }
}
