package six.inbuilt;

import java.util.function.Function;

public class FunctionInterface {
    public static Function<Integer, Integer> addFunction = (a) -> a + 4;
    public static Function<Integer, Integer> subFunction = (a) -> a - 2;

    public static Function<Integer, Integer> combinedFunction =
            addFunction.andThen(subFunction);


    public static void main(String[] args) {
        System.out.println(addFunction.apply(10)); // 10 + 4 = 14
        System.out.println(subFunction.apply(10)); // 10 -2 = 8
        System.out.println(combinedFunction.apply(10)); // 14-3 = 12
    }
}
