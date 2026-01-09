package six.inbuilt;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> consumer1 =
                (str) -> System.out.println(str);
        consumer1.accept("Hello");
        consumer1.accept("Hii");

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        Consumer<Integer> multiplyByTwo =
                n -> System.out.println(n*2);
        numbers.forEach(multiplyByTwo);
    }
}
