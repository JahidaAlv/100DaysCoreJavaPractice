package java8.Questions;

import java.util.stream.Stream;

public class Q10 {
    public static void main(String[] args) {
        Stream.of(1,2,3,4)
                .limit(2)
                .forEach(System.out::print);
    }
}
// Java 8 MCQ - Comment Output
//A. 12
//B. 1234
//C. 34
//D. Error

