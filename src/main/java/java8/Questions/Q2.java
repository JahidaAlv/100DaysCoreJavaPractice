package java8.Questions;

import java.util.Arrays;
import java.util.List;
public class Q2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");
        list.stream().map(String::toLowerCase)
                .forEach(
                        System.out::print
                );
    }
}
//abc

