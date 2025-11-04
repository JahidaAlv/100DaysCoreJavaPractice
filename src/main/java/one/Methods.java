package one;

import org.w3c.dom.ls.LSOutput;

//Reusable block of code
//A method is like a function in other programming languages.
//It is defined inside a class and can be called to perform an operation.
public class Methods {

    // (A) User-defined Methods
    //void, Does not return any value
    //int, double, String, etc. Returns a value of that type

    void sayHello(){
        System.out.println("Hello, java coding");
    }

    // parameters
    int addNumbers(int a, int b){
        return a + b;
    }

    int subNumbers(int a, int b){
        return a-b;
    }

    int mulNumbers(int a, int b){
        return a*b;
    }

    int divNumbers(int a, int b){
        return a/b;
    }


    public static void main(String[] args) {

        Methods obj = new Methods(); // Create object
        obj.sayHello();                // Call method
        System.out.println(obj.addNumbers(10,20));
        System.out.println(obj.subNumbers(20,10));
        System.out.println(obj.mulNumbers(10,9));
        System.out.println(obj.divNumbers(40,4));

        //(A) Predefined Methods (Built-in)
        String name = "Jahida";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

    }
}

