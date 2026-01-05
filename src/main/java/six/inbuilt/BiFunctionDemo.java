package six.inbuilt;

import java.util.function.BiFunction;

public class BiFunctionDemo {

    public static BiFunction<Integer, Integer, Integer> addFunction
            = (a, b) -> a + b;

    public static BiFunction<Integer, Integer, Integer> subFunction
            = (Integer a, Integer b) -> a - b;


    public static void main(String[] args) {
        System.out.println(addFunction.apply(20,20));
        System.out.println(subFunction.apply(20,10));
    }
}
