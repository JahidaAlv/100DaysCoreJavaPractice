package two;
// Data Types?
// A data type defines what kind of data a variable can store.

public class JavaDataTypes {
    public static void main(String[] args) {

        // Primitive data types

        int age = 20;
        short s = 100;
        char c = 'A';
        float f = 3.14f;
        boolean b = true;
        double d = 44.45;
        long l = 2324567;
        byte byt = 10;

        System.out.println("int:" + age);
        System.out.println("short:" + s);
        System.out.println("char:" + c);
        System.out.println("float:" + f);
        System.out.println("boolean:" + b);
        System.out.println("double:" + d);
        System.out.println("long:" + l);
        System.out.println("byte:" + b);

        // non-primitive data types

        int[] marks = {2,3,4,5};
        System.out.println(marks[0]);
        System.out.println(marks[2]);

    }
}
