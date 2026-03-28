package java8.Questions;

import java.util.Arrays;
import java.util.List;

public class Q7 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,5,6,8);
        long count = list.stream()
                .filter(i -> i > 3)
                .count();
        System.out.println(count);
    }
}
