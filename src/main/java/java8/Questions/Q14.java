package java8.Questions;

import java.util.Arrays;
import java.util.List;

public class Q14 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3);

        list.stream()
                .filter(n -> n > 1)
                .forEach(System.out::print);
    }
}
// Java 8 MCQ - Comment Output
//A. 1
//B. 23
//C. 12
//D. Error



