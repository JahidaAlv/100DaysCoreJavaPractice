package six.inbuilt;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> consumer1 =
                (str) -> System.out.println(str);
        consumer1.accept("Hello");
        consumer1.accept("Hii");
    }
}
