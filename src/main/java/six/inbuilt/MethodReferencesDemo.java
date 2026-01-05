package six.inbuilt;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReferencesDemo {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice", "Charlie", "Bob");

        // using for loop
        for (int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }

        // using for-each
        for (String name : names)
            System.out.println(name);
//imp
//        names.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String name) {
//                System.out.println(name);
//            }
//        });


//        names.forEach((String name) -> {
//                System.out.println(name);
//            });

//        names.forEach((name) -> {
//            System.out.println(name);
//        });

        names.forEach((System.out::println));

    }
}
