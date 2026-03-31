package java8.Questions;

import java.util.stream.Stream;

public class Q9 {
    public static void main(String[] args) {
        Stream.of("A", "B", "C")
                .findFirst()
                .ifPresent(System.out::print);
    }
}
// Java 8 MCQ - Comment Output 👇
//A. ABC
//B. A
//C. C
//D. Error

