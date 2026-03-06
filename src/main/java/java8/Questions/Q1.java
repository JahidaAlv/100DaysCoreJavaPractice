package java8.Questions;

import java.util.Arrays;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);
        list.stream()
                .filter(i -> i % 2 == 0)
                .forEach(
                        System.out::print
                );
    }
}


//24