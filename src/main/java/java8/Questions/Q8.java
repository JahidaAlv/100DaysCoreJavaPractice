package java8.Questions;

import java.util.Arrays;
import java.util.List;

public class Q8 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3);

        list.stream()
                .map(i -> i * 2)
                .forEach(System.out::print);


    }
}



